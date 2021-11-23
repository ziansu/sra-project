public void login() {
    if (("BootsFaces".equalsIgnoreCase(username)) && ("rocks!".equalsIgnoreCase(password))) {
        javax.faces.application.FacesMessage msg = new javax.faces.application.FacesMessage(javax.faces.application.FacesMessage.SEVERITY_INFO, "Congratulations! You've successfully logged in.", "");
        javax.faces.context.FacesContext.getCurrentInstance().addMessage("loginForm:password", msg);
    }else {
        javax.faces.application.FacesMessage msg = new javax.faces.application.FacesMessage(javax.faces.application.FacesMessage.SEVERITY_ERROR, "That's the wrong password. Hint: BootsFaces rocks!", "");
        javax.faces.context.FacesContext.getCurrentInstance().addMessage("loginForm:password", msg);
    }
}