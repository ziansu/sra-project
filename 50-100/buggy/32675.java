public void onClick(javax.faces.event.AjaxBehaviorEvent event) {
    javax.faces.application.FacesMessage msg = new javax.faces.application.FacesMessage();
    msg.setSeverity(FacesMessage.SEVERITY_INFO);
    msg.setDetail("Name");
    msg.setSummary("Hinzugefügt");
    javax.faces.context.FacesContext.getCurrentInstance().addMessage(null, msg);
}