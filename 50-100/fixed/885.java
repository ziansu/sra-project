public void addFileEntries(java.util.ArrayList<com.notalenthack.blaster.FileEntry> entries) {
    items.clear();
    mapItems.clear();
    for (com.notalenthack.blaster.FileEntry entry : entries) {
        items.add(entry);
        mapItems.put((((entry.path) + (java.io.File.separator)) + (entry.name)), entry);
    }
}