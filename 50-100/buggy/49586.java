private void executeScript(java.lang.String script, speedy.persistence.relational.AccessConfiguration accessConfiguration) {
    try {
        speedy.persistence.relational.QueryManager.executeScript(script, accessConfiguration, true, true, true, false);
    } catch (speedy.exceptions.DBMSException ex) {
        if ((ex.getMessage().contains("ERROR: function bigint_skolem(text) does not exist")) || (ex.getMessage().contains("ERROR: function double_skolem(text) does not exist"))) {
            it.unibas.lunatic.model.chase.chasede.operators.dbms.ChaseSQLSTTGDs.logger.warn("Some functions are missing in the current C3p0 thread. Retrying...");
            executeScript(script, accessConfiguration);
            return ;
        }
        throw ex;
    }
}