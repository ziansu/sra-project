public int getRemainingKeys() {
    if ((seqNum) <= (seqMax)) {
        return (seqMax) - (seqNum);
    }else {
        return ((totalKeys) - (seqNum)) + (seqMax);
    }
}