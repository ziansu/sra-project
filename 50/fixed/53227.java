public void loeschePosition() {
    java.lang.String posId = getRequestParameter("posId");
    learningAgreement = learningAgreementController.loescheLearningAgreementPosition(java.lang.Integer.parseInt(posId));
    changesUnsaved = true;
    javax.faces.context.FacesContext.getCurrentInstance().renderResponse();
}