public V get(java.lang.Object key) {
    if ((size) == 0)
        return null;
    
    if ((size) < (maxListFill)) {
        for (int i = 0; i < (size); i++) {
            if (listKeys[i].equals(key))
                return ((V) (listValues[i]));
            
        }
        return null;
    }else {
        return innerMap.get(key);
    }
}