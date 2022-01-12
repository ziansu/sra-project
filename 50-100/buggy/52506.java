public void unmarkCompacting(java.lang.Iterable<org.apache.cassandra.io.sstable.SSTableReader> unmark) {
    boolean isValid = cfstore.isValid();
    if (!isValid) {
        for (org.apache.cassandra.io.sstable.SSTableReader sstable : unmark)
            sstable.markObsolete();
        
    }
    org.apache.cassandra.db.DataTracker.View currentView;
    org.apache.cassandra.db.DataTracker.View newView;
    do {
        currentView = view.get();
        newView = currentView.unmarkCompacting(unmark);
    } while (!(view.compareAndSet(currentView, newView)) );
    if (!isValid) {
        unreferenceSSTables();
    }
}