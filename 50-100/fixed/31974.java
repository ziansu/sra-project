public java.util.concurrent.CompletableFuture<wordpackbot.states.Playback> next() {
    java.lang.String value = entryIterator.next();
    if (wordpackbot.states.Playback.END_OF_ENTRY.equals(value)) {
        value = (entryIterator.hasNext()) ? entryIterator.next() : null;
    }
    return value != null ? java.util.concurrent.CompletableFuture.completedFuture(new wordpackbot.states.Playback(value, entryIterator, onFinish)) : onFinish.get();
}