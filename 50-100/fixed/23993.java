private void openConnection() {
    if ((this.connexion) != null) {
        this.connexion.close();
    }
    try {
        this.connexion = sample.Connexion.getInstance();
        sample.Message m = this.connexion.receive();
        logger.Logger.log(new logger.LogMessage(logger.LogType.SUCCESS, m.toString()));
    } catch (java.io.IOException e) {
        logger.Logger.log(new logger.LogMessage(e.getMessage()));
    }
}