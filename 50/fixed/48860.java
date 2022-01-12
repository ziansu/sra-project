public void clear() {
    if ((mDisplayNamesSorted.size()) != 0) {
        mDisplayNamesSorted.clear();
        notifyChanged();
    }
}