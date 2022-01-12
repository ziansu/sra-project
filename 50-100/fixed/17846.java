public void refreshEntryList() {
    for (final java.io.File fileEntry : getBaseContext().getFilesDir().listFiles()) {
        if (!(mainEntryList.contains(fileEntry.getName()))) {
            mainEntryList.add(fileEntry.getName());
        }
    }
    if (mainEntryList.isEmpty()) {
        mainEntryList.add("No entries found");
    }
}