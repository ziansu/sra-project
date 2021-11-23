public Item dequeue() {
    verifyNotEmpty();
    int i = randomIndex();
    Item itemToDequeue = s[i];
    s[i] = s[(--(tail))];
    s[((tail) + 1)] = null;
    if (needToCompress())
        compress();
    
    return itemToDequeue;
}