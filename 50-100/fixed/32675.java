public void onClick(javax.faces.event.AjaxBehaviorEvent event) {
    javax.faces.application.FacesMessage msg = new javax.faces.application.FacesMessage();
    msg.setSeverity(FacesMessage.SEVERITY_INFO);
    msg.setSummary("Name");
    msg.setDetail("Hinzugefügt");
    javax.faces.context.FacesContext.getCurrentInstance().addMessage(null, msg);
}