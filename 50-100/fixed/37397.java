public java.util.List<K> keys() {
    java.util.List<K> keys = new java.util.ArrayList<>(size());
    for (int i = 0; i < (capacity); i++)
        if (((keyTable[i]) != null) && ((keyTable[i]) != (DELETED_KEY_TOKEN)))
            keys.add(keyTable[i]);
        
    
    return keys;
}