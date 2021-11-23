@java.lang.Override
public java.util.Iterator<org.araqne.logdb.cep.EventKey> getContextKeys(java.lang.String topic) {
    if (topic == null)
        return new java.util.HashSet<org.araqne.logdb.cep.EventKey>(contexts.keySet()).iterator();
    
    java.util.HashSet<org.araqne.logdb.cep.EventKey> keys = new java.util.HashSet<org.araqne.logdb.cep.EventKey>();
    for (org.araqne.logdb.cep.EventKey key : contexts.keySet()) {
        if (key.getTopic().equals(topic))
            keys.add(key);
        
    }
    return keys.iterator();
}