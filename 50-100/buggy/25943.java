public Item dequeue() {
    verifyNotEmpty();
    int i = randomIndex();
    Item itemToDequeue = s[i];
    s[i] = s[tail];
    s[tail] = null;
    (tail)--;
    if (needToCompress())
        compress();
    
    return itemToDequeue;
}