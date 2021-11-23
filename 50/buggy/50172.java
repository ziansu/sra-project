private void initialise(it.emarolab.cagg.debugging.CaggLoggersManager.LoggersNames names, java.lang.String log4jConfigPath) {
    this.names = new it.emarolab.cagg.debugging.CaggLoggersManager.LoggersNames();
    this.log4jConfigPath = log4jConfigPath;
    this.applyAll();
    it.emarolab.cagg.debugging.CaggLoggersManager.setFilePath(null);
}