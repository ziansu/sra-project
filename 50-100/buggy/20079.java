void ensureDataAvailable(final long position) {
    if (position > (commitOffset)) {
        log.warn("Oldest kafka position is {} and commit offset is {}, updating", position, commitOffset);
        commitOffset = position;
    }
    if (position > (sentOffset)) {
        log.warn("Oldest kafka position is {} and sent offset is {}, updating", position, commitOffset);
        sentOffset = position;
    }
}