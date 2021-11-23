private void resetHiddenStatus() {
    for (T item : mItems) {
        eu.davidea.flexibleadapter.items.IHeader header = getHeaderOf(item);
        if (header != null)
            header.setHidden(true);
        
    }
}