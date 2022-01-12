boolean isActiveKey(java.lang.String sKey) {
    java.util.Hashtable keys = com.twinsoft.tas.KeyManager.keys;
    java.util.Iterator iter = keys.values().iterator();
    while (iter.hasNext()) {
        com.twinsoft.tas.Key k = ((com.twinsoft.tas.Key) (iter.next()));
        java.lang.String str = k.sKey;
        if (str.equals(sKey))
            return true;
        
    } 
    return true;
}