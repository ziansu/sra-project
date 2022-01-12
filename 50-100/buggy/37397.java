public K[] keys() {
    int index = 0;
    K[] keys = ((K[]) (new java.lang.Object[size()]));
    for (int i = 0; i < (capacity); i++)
        if (((keyTable[i]) != null) && ((keyTable[i]) != (DELETED_KEY_TOKEN)))
            keys[(index++)] = keyTable[i];
        
    
    return keys;
}