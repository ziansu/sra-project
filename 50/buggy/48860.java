public void clearUsedNames() {
    if ((mDisplayNamesSorted.size()) != 0) {
        mDisplayNamesSorted.clear();
        notifyChanged();
    }
}