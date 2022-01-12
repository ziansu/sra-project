public int lookup(int index, short remainder) {
    int currentIndex = index;
    org.bucaojit.filter.Slot currentSlot = set.get(currentIndex);
    int foundIndex = -1;
    int runStart = 0;
    if (currentSlot.getMetadata().isClear())
        return -1;
    
    runStart = findRunStart(currentIndex);
    return checkQuotient(runStart, remainder);
}