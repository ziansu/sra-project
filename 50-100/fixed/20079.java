void ensureDataAvailable(final long position) {
    if (position > ((commitOffset) + 1)) {
        log.warn("Oldest kafka position is {} and commit offset is {}, updating", position, commitOffset);
        commitOffset = position;
    }
    if (position > ((sentOffset) + 1)) {
        log.warn("Oldest kafka position is {} and sent offset is {}, updating", position, commitOffset);
        sentOffset = position;
    }
}