public java.lang.String signOut() {
    javax.faces.context.FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
    org.primefaces.context.RequestContext.getCurrentInstance().showMessageInDialog(new javax.faces.application.FacesMessage(javax.faces.application.FacesMessage.SEVERITY_INFO, "Signed Out", "Thank you, have a good day."));
    return "employeeSignIn";
}