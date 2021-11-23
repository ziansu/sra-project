public com.enonic.xp.index.PatternIndexConfigDocument.Builder add(final java.lang.String path, final com.enonic.xp.index.IndexConfig indexConfig) {
    final com.enonic.xp.index.PathIndexConfig pathIndexConfig = com.enonic.xp.index.PathIndexConfig.create().path(com.enonic.xp.data.PropertyPath.from(path)).indexConfig(indexConfig).build();
    this.pathIndexConfigs.add(pathIndexConfig);
    this.stringPathIndexConfigMap.put(path, pathIndexConfig);
    return this;
}