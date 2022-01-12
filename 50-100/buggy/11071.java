private static java.lang.String parseFile(java.lang.String data, java.lang.String fileName, ConfigFileFormat configFileFormat) {
    java.lang.String convertedConfig = "";
    switch (configFileFormat) {
        case XML :
            convertedConfig = data;
            break;
        case YML :
            convertedConfig = ConfigUtil2.parseYML(data, fileName);
            break;
        case PROPERTIES :
            convertedConfig = ConfigUtil2.parseProperties(data);
            break;
        default :
            break;
    }
    return convertedConfig;
}