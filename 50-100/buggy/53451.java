private void processSavedFiles() {
    for (int i = 0; i < (foundCrosswordFiles.length); i++) {
        if ((foundCrosswordFiles[i].isDirectory()) && (foundCrosswordFiles[i].getName().contains("-"))) {
            addCrosswordToLibrary(new com.thonners.crosswordmaker.CrosswordLibraryManager.SavedCrossword(context, foundCrosswordFiles[i]));
        }
    }
}