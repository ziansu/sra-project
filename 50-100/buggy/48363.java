@java.lang.Override
public com.enonic.xp.index.IndexConfig getConfigForPath(final com.enonic.xp.data.PropertyPath dataPath) {
    final com.enonic.xp.index.PathIndexConfig exactMatch = pathIndexConfigMap.get(dataPath.resetAllIndexesTo(0).toString());
    if (exactMatch != null) {
        return exactMatch.getIndexConfig();
    }
    for (final com.enonic.xp.index.PathIndexConfig pathIndexConfig : pathIndexConfigs) {
        if (pathIndexConfig.matches(dataPath)) {
            return pathIndexConfig.getIndexConfig();
        }
    }
    return defaultConfig;
}