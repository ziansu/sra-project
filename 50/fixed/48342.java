public void showError(java.lang.String message, java.lang.Exception e) {
    logException(e);
    edu.brandeis.cs.nlp.mae.controller.MaeMainController.logger.error(message);
    getDialogs().showError(message, e);
}