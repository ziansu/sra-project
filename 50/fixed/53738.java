public void showError(java.lang.String message) {
    edu.brandeis.cs.nlp.mae.controller.MaeMainController.logger.error(message);
    getDialogs().showError(message);
}