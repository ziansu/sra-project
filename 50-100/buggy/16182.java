private void upgradeClient() {
    java.lang.System.out.println("\n##################################");
    java.lang.System.out.println("Upgrading grouper client\n");
    this.compareAndReplaceJar(this.grouperClientJar, new java.io.File((((this.untarredClientDir) + (java.io.File.separator)) + "grouperClient.jar")), true);
    this.compareUpgradePropertiesFile(this.grouperClientBasePropertiesFile, new java.io.File((((this.untarredClientDir) + (java.io.File.separator)) + "grouper.client.base.properties")), this.grouperClientPropertiesFile, this.grouperClientExamplePropertiesFile, edu.internet2.middleware.grouperInstaller.util.GrouperInstallerUtils.toSet("grouperClient.webService.client.version"));
}