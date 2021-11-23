public void showError(java.lang.String message) {
    getDialogs().showError(message);
    edu.brandeis.cs.nlp.mae.controller.MaeMainController.logger.error(message);
}