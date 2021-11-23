public void connect() {
    if (!(isProjectConfigured())) {
        configureProject();
    }
    if (!(isConnected())) {
        if ((eu.kidf.diversicon.core.Diversicons.isH2Db(divConfig.getDbConfig())) && (eu.kidf.diversicon.core.Diversicons.isEmpty(divConfig.getDbConfig()))) {
            eu.kidf.diversicon.core.Diversicons.dropCreateTables(divConfig.getDbConfig());
        }
        diversicon = eu.kidf.diversicon.core.Diversicon.connectToDb(divConfig);
        eu.kidf.diversicon.cli.DiverCli.LOG.info("");
        eu.kidf.diversicon.cli.DiverCli.LOG.info("");
    }
}