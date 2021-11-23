public void close() {
    try {
        if ((connection) != null) {
            org.academiadecodigo.bootcamp8.freespeech.server.utils.logger.Logger.getInstance().eventlogger(TypeEvent.DATABASE, LoggerMessages.DB_TERMINATE);
            connection.close();
        }
    } catch (java.sql.SQLException ex) {
        java.lang.System.err.println(ex.getMessage());
    }
}