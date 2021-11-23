public boolean find() {
    int nextSearchIndex = last;
    if (nextSearchIndex == (first))
        nextSearchIndex++;
    
    if (nextSearchIndex < (from))
        nextSearchIndex = from;
    
    if (nextSearchIndex > (to)) {
        return false;
    }
    return search(nextSearchIndex);
}