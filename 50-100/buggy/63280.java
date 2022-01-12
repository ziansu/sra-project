public void createCurrentOracleLinuxInstance(java.lang.String name, java.lang.String vcnName, java.lang.String subnetName, java.lang.String shapeName, java.lang.String userdataFilePath, java.lang.String profile) throws java.io.IOException, java.lang.Exception {
    h.help(name, "<name> <vcn-name> <subnet-name> <shape-name> <user-data-file-path> <profile>");
    this.createInstance(shapeName, vcnName, subnetName, bglutil.jiu.Config.getCurrentOracleLinuxImage(profile), shapeName, userdataFilePath, profile);
}