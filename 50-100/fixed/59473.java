@java.lang.Override
public void done(org.parse4j.ParseObject arg0, org.parse4j.ParseException arg1) {
    if (arg0 != null)
        for (java.lang.String key : arg0.keySet())
            objectFields.put(key, arg0.get(key));
        
    
    synchronized(mutex) {
        mutex.append("done");
        mutex.notifyAll();
    }
}