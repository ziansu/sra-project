private int probe(java.lang.String key) {
    int i = (h1(key)) % (tableLength);
    int j = h2(key);
    int iterations = 0;
    while ((table[i]) != null) {
        i = (i + j) % (tableLength);
        iterations++;
        if (iterations > (tableLength)) {
            return -1;
        }
    } 
    return i;
}