public V[] values() {
    int index = 0;
    V[] values = ((V[]) (new java.lang.Object[size()]));
    for (int i = 0; i < (capacity); i++)
        if (((valueTable[i]) != null) && ((keyTable[i]) != (DELETED_KEY_TOKEN)))
            values[(index++)] = valueTable[i];
        
    
    return values;
}