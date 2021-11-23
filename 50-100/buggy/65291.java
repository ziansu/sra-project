public java.lang.Boolean getFinished() {
    try {
        if (Fight.isFinished()) {
            return true;
        }else {
            return false;
        }
    } catch (Model.ObjectDeprecatedException ex) {
        LoggingUtilities.LOGGER.log(java.util.logging.Level.SEVERE, null, ex);
        return false;
    }
}