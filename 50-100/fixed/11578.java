public static java.util.List<cascading.tuple.TupleEntry> getAllTupleEntries(cascading.tap.Tap<org.apache.hadoop.mapred.JobConf, ?, ?> t) throws java.io.IOException {
    cascading.tuple.TupleEntryIterator iter = t.openForRead(com.liveramp.cascading_ext.CascadingUtil.get().getFlowProcess());
    java.util.List<cascading.tuple.TupleEntry> tuples = new java.util.ArrayList<cascading.tuple.TupleEntry>();
    while (iter.hasNext()) {
        tuples.add(new cascading.tuple.TupleEntry(iter.next()));
    } 
    return tuples;
}