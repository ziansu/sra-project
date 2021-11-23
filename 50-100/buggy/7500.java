public java.lang.String deleteAccount() {
    if (statusMessage.isEmpty()) {
        int user_id = ((int) (javax.faces.context.FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("user_id")));
        try {
            userFacade.deleteUser(user_id);
        } catch (javax.ejb.EJBException e) {
            username = "";
            statusMessage = "Something went wrong while deleting your account!";
            return "";
        }
        return "/index.xhtml?faces-redirect=true";
    }
    return "";
}