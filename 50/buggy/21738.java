public static void logExternalDataVersion() {
    java.lang.String externalDataVersion = function.external.base.DataManager.getVersion();
    if (!(externalDataVersion.isEmpty())) {
        utils.LogManager.writeAndPrint("External data version:");
        utils.LogManager.writeAndPrintNoNewLine(externalDataVersion);
    }
}