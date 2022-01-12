public boolean checkMemoryAvailability(int newTupleSize) {
    if ((startBufferingTimeInMemory) == 0) {
        startBufferingTimeInMemory = java.lang.System.currentTimeMillis();
    }
    if ((((tuplesCountInMemory) == (maxTuplesInMemory)) || (((tuplesSizeInMemory) + newTupleSize) > (maxTuplesSizeInMemory))) || (((java.lang.System.currentTimeMillis()) - (startBufferingTimeInMemory)) > (maxBufferingTimeInMemory))) {
        return false;
    }
    return true;
}