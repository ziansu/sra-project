public static void main(java.lang.String[] args) {
    it.polimi.modaclouds.scalingrules.utils.CloudMLDaemon m = new it.polimi.modaclouds.scalingrules.utils.CloudMLDaemon();
    com.beust.jcommander.JCommander jc = new com.beust.jcommander.JCommander(m, args);
    java.lang.System.out.println(it.polimi.modaclouds.scalingrules.utils.CloudMLDaemon.APP_TITLE);
    if (m.help) {
        jc.usage();
        java.lang.System.exit(0);
    }
    it.polimi.modaclouds.scalingrules.Configuration.CLOUDML_PORT = m.cloudMLPort;
    it.polimi.modaclouds.scalingrules.utils.CloudMLDaemon.logger.info("Starting the CloudML daemon on port {}...", it.polimi.modaclouds.scalingrules.Configuration.CLOUDML_PORT);
    it.polimi.modaclouds.scalingrules.utils.CloudMLDaemon.start(it.polimi.modaclouds.scalingrules.Configuration.CLOUDML_PORT);
}