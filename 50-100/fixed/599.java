private static hsyndicate.fs.SyndicateFileSystem createHSyndicateFS(org.apache.hadoop.conf.Configuration conf, java.lang.String address) throws java.io.IOException {
    hsyndicate.fs.SyndicateFSConfiguration sconf = hsyndicate.hadoop.utils.HSyndicateConfigUtils.createSyndicateConf(conf, address);
    try {
        return new hsyndicate.fs.SyndicateFileSystem(sconf);
    } catch (java.lang.InstantiationException ex) {
        throw new java.io.IOException(ex.getCause());
    }
}