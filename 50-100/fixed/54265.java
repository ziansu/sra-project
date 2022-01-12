@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public void run() {
    maps = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Long>>();
    java.lang.Object[] mapArray = Connector.receiveData(ReduceJob.DEFAULT_LISTENING_PORT, 3);
    for (java.lang.Object map : mapArray)
        maps.add(((java.util.Map<java.lang.String, java.lang.Long>) (map)));
    
    reduce(3, maps);
    isDone();
}