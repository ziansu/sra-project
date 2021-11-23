public java.util.List<com.team6.entityclasses.Notes> getItems() {
    java.lang.String user_name = ((java.lang.String) (javax.faces.context.FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("username")));
    com.team6.entityclasses.User user = getUserFacade().findByUsername(user_name);
    int user_id = user.getId();
    items = getFacade().findNotesByUserId(user_id);
    if ((items) != null) {
        return items;
    }
    return new java.util.LinkedList<com.team6.entityclasses.Notes>();
}