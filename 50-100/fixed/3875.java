public void disconnect(java.lang.Long key) {
    if (key == null)
        return ;
    
    intraplex.livelook.LogMapEntry e = logMap.get(key);
    if (e == null)
        return ;
    
    intraplex.livelook.Stream stream = map.get(key);
    if (stream == null)
        return ;
    
    removeKey = key;
    mapUpdate = true;
}