public int CountStack() {
    c = top;
    Count = 0;
    while ((c) != null) {
        (Count)++;
        c = c.next;
    } 
    return Count;
}