private de.jhoff.dmap.DMap.Entry getNextEntry() throws java.io.IOException {
    if (keyIterator_.hasNext()) {
        de.jhoff.dmap.util.ByteArray key = keyIterator_.next();
        return new de.jhoff.dmap.DMap.Entry(key.getBytes(), get(key.getBytes()));
    }
    while (blockIterator_.hasNext()) {
        keyIterator_ = blockIterator_.next().keySet().iterator();
        if (keyIterator_.hasNext())
            return getNextEntry();
        
    } 
    return null;
}