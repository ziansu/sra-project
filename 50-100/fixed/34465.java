private int maybeCommit(java.lang.Integer sequenceNumber) {
    if (writesRequiredForCommit.remove(sequenceNumber)) {
        if ((writesRequiredForCommit.size()) == 0) {
            writeLock.release();
            return writes.size();
        }
    }
    return 0;
}