public void searchActionListener(javax.faces.event.ActionEvent actionEvent) {
    javax.faces.context.FacesContext facesContext = javax.faces.context.FacesContext.getCurrentInstance();
    javax.faces.event.PhaseId phaseId = facesContext.getCurrentPhaseId();
    com.liferay.faces.demos.bean.InputSearchBacking.logger.debug("searchActionListener: phaseId=[{0}]", phaseId.toString());
    java.lang.String phaseName = phaseId.toString();
    javax.faces.application.FacesMessage facesMessage = new javax.faces.application.FacesMessage((("The searchActionListener method was called during the " + phaseName) + " phase of the JSF lifecycle."));
    facesContext.addMessage(null, facesMessage);
}