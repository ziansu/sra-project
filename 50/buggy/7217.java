public java.lang.String remove(java.lang.String key) {
    int index = getIndex(key);
    if (!(storage[index].contains(key)))
        (size)--;
    
    return storage[index].remove(key);
}