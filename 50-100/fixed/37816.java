public java.util.List<V> values() {
    java.util.List<V> values = new java.util.ArrayList<>(size());
    for (int i = 0; i < (capacity); i++)
        if (((keyTable[i]) != null) && ((keyTable[i]) != (DELETED_KEY_TOKEN)))
            values.add(valueTable[i]);
        
    
    return values;
}