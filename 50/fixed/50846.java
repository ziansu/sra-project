public void resetIterator() {
    if ((!(reading)) && (!(writing)))
        throw new java.lang.IllegalStateException("Not editing file!");
    
    pos = subPos = 0;
}