private void updateEntryObservers() {
    for (int i = 0; i < (mEntries.size()); i++) {
        mEntries.get(i).updateObserver();
    }
}