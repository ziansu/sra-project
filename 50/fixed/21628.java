public void endReading() throws java.io.IOException {
    if (((readingCount.decrementAndGet()) == 0) && (doClose.get())) {
        close();
        synchronized(index.oldmonitors) {
            index.oldmonitors.remove(this);
        }
    }
}