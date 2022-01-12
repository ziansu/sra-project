public void unmarkCompacting(java.lang.Iterable<org.apache.cassandra.io.sstable.SSTableReader> unmark) {
    org.apache.cassandra.db.DataTracker.View currentView;
    org.apache.cassandra.db.DataTracker.View newView;
    do {
        currentView = view.get();
        newView = currentView.unmarkCompacting(unmark);
    } while (!(view.compareAndSet(currentView, newView)) );
    if (!(cfstore.isValid())) {
        unreferenceSSTables();
    }
}