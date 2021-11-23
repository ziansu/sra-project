public void endReading() throws java.io.IOException {
    if (((readingCount.decrementAndGet()) == 0) && (doClose)) {
        close();
        synchronized(index.oldmonitors) {
            index.oldmonitors.remove(this);
        }
    }
}