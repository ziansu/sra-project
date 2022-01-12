@java.lang.Override
public void init(org.apache.accumulo.core.iterators.SortedKeyValueIterator<org.apache.accumulo.core.data.Key, org.apache.accumulo.core.data.Value> source, java.util.Map<java.lang.String, java.lang.String> map, org.apache.accumulo.core.iterators.IteratorEnvironment iteratorEnvironment) throws java.io.IOException {
    this.source = source;
    if (source == null)
        throw new java.lang.IllegalArgumentException("source must be specified");
    
    java.lang.System.out.println("reset watch at RemoteWriteIterator init");
    parseOptions(map);
    if (!(source instanceof edu.mit.ll.graphulo.skvi.SaveStateIterator)) {
        numEntriesCheckpoint = -2;
    }
    reducer.init(reducerOptions, iteratorEnvironment);
    setupConnectorWriter();
}