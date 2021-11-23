public K next() {
    int index = (i)++;
    while (((i) < ((keys.length) - 1)) && ((keys[i]) == null))
        (i)++;
    
    return keys[index];
}