private int maybeCommit(java.lang.Integer sequenceNumber) {
    try {
        if (writesRequiredForCommit.remove(sequenceNumber)) {
            if ((writesRequiredForCommit.size()) == 0) {
                return writes.size();
            }
        }
        return 0;
    } finally {
        writeLock.release();
    }
}