public org.apache.hadoop.io.DataInputBuffer getValue() throws java.io.IOException {
    final int kvoff = ((current) * (org.apache.hadoop.mapreduce.scache.ScacheKVIterator.NMETA)) % (kvmeta.size());
    keybuf.reset(rawData, kvmeta.get((kvoff + (org.apache.hadoop.mapreduce.scache.ScacheKVIterator.VALSTART))), kvmeta.get((kvoff + (org.apache.hadoop.mapreduce.scache.ScacheKVIterator.VALLEN))));
    return vbytes;
}