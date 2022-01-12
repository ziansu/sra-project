public void forgotPassword() {
    javax.faces.application.FacesMessage msg = new javax.faces.application.FacesMessage(javax.faces.application.FacesMessage.SEVERITY_INFO, "Default user name: BootsFaces", "");
    javax.faces.context.FacesContext.getCurrentInstance().addMessage("loginForm:username", msg);
    msg = new javax.faces.application.FacesMessage(javax.faces.application.FacesMessage.SEVERITY_INFO, "Default password: rocks!", "");
    javax.faces.context.FacesContext.getCurrentInstance().addMessage("loginForm:password", msg);
}