public void setFinished(java.lang.Boolean isFightFinished) {
    try {
        Fight.setFinished(isFightFinished);
    } catch (java.sql.SQLException | Model.ObjectDeprecatedException ex) {
        LoggingUtilities.LOGGER.log(java.util.logging.Level.SEVERE, null, ex);
    }
}