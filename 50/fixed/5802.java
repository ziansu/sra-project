public long address() {
    if ((activeRegion) == null)
        throw new java.lang.IllegalArgumentException("Address has not been set!");
    
    return (activeRegion.startAddr) + ((position()) - (activeRegion.offset));
}