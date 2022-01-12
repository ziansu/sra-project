@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public void run() {
    java.util.Map<java.lang.String, java.lang.Long>[] mapArray = ((java.util.Map<java.lang.String, java.lang.Long>[]) (Connector.receiveData(ReduceJob.DEFAULT_LISTENING_PORT, 3)));
    maps = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Long>>();
    for (java.util.Map<java.lang.String, java.lang.Long> map : mapArray)
        maps.add(map);
    
    reduce(3, maps);
    isDone();
}