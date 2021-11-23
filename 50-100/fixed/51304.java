public int findKey(java.lang.String key) {
    int i = h1(key);
    int j = h2(key);
    int iterations = 0;
    i %= tableLength;
    while ((table[i]) != null) {
        if (table[i].key.equals(key)) {
            return i;
        }
        i = (i + j) % (tableLength);
        iterations++;
        if (iterations > (tableLength))
            return -1;
        
    } 
    return -1;
}