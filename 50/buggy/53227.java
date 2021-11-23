public void loeschePosition() {
    java.lang.String posId = getRequestParameter("posId");
    java.lang.System.out.println(("Posititionsnummer " + posId));
    learningAgreement = learningAgreementController.loescheLearningAgreementPosition(java.lang.Long.parseLong(posId));
    changesUnsaved = true;
    javax.faces.context.FacesContext.getCurrentInstance().renderResponse();
}