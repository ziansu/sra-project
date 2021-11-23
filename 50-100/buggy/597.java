@java.lang.Override
public java.lang.String getPropertyValue() {
    java.lang.String result = null;
    net.pms.configuration.ConfigurationReader configurationReader = net.pms.logging.DebugLogPropertyDefiner.configuration.getConfigurationReader();
    boolean saveLogOverride = configurationReader.getLogOverrides();
    configurationReader.setLogOverrides(false);
    switch (key) {
        case "debugLogPath" :
            result = getDebugLogPath();
        case "rootLevel" :
            result = getRootLevel();
    }
    configurationReader.setLogOverrides(saveLogOverride);
    return result;
}