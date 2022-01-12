public com.enonic.xp.index.PatternIndexConfigDocument.Builder add(final com.enonic.xp.data.PropertyPath path, final com.enonic.xp.index.IndexConfig indexConfig) {
    final com.enonic.xp.index.PathIndexConfig pathIndexConfig = com.enonic.xp.index.PathIndexConfig.create().path(path).indexConfig(indexConfig).build();
    this.pathIndexConfigs.add(pathIndexConfig);
    this.stringPathIndexConfigMap.put(path.resetAllIndexesTo(0).toString(), pathIndexConfig);
    return this;
}