private static java.lang.String readFromYAMLList(java.util.List<de.tobiyas.util.config.YAMLConfigExtended> configList, java.lang.String tag) {
    for (de.tobiyas.util.config.YAMLConfigExtended config : configList) {
        if (config.contains(tag)) {
            return config.getString(tag);
        }
    }
    return null;
}