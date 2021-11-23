public me.prettyprint.hom.CollectionMapperHelper.CollectionInfoColValue parseCollectionInfoColValue(byte[] val) {
    try {
        java.lang.String tmp = new java.lang.String(val);
        java.lang.Iterable<java.lang.String> split = com.google.common.base.Splitter.on(':').split(tmp);
        java.util.Iterator<java.lang.String> iter = split.iterator();
        return new me.prettyprint.hom.CollectionMapperHelper.CollectionInfoColValue(iter.next(), java.lang.Integer.parseInt(iter.next()));
    } catch (java.lang.Throwable e) {
        throw new me.prettyprint.hom.cache.HectorObjectMapperException("exception while parsing collection info column value", e);
    }
}