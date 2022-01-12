private static void executeTool(java.lang.String toolIdentifier, java.lang.String... toolArgs) throws org.wso2.carbon.tools.exception.CarbonToolException {
    if (toolIdentifier == null) {
        throw new org.wso2.carbon.tools.exception.CarbonToolException("The Carbon tool identifier cannot be null");
    }
    org.wso2.carbon.tools.CarbonTool carbonTool;
    switch (toolIdentifier) {
        case "jar-to-bundle-converter" :
            carbonTool = new org.wso2.carbon.tools.converter.BundleGeneratorTool();
            break;
        case "osgi-lib-deployer" :
            carbonTool = new org.wso2.carbon.tools.osgilib.OSGiLibDeployerTool();
            break;
        case "secure-vault" :
            carbonTool = new org.wso2.carbon.tools.securevault.CipherToolInitializer();
            break;
        default :
            carbonTool = null;
    }
    if (carbonTool != null) {
        carbonTool.execute(toolArgs);
    }
}