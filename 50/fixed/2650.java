@java.lang.Override
public java.util.Iterator<edu.usc.irds.sparkler.model.FetchedData> fetch(java.util.Iterator<edu.usc.irds.sparkler.model.Resource> resources) throws java.lang.Exception {
    return new edu.usc.irds.sparkler.util.FetcherDefault.FetchIterator(resources);
}