public void addLibraryEntry(final com.charlesmadere.hummingbird.models.AnimeLibraryEntry libraryEntry) {
    if ((mLibraryEntries) == null) {
        mLibraryEntries = new java.util.ArrayList<>(1);
        mLibraryEntries.add(libraryEntry);
    }else
        if (mLibraryEntries.contains(libraryEntry)) {
            mLibraryEntries.set(mLibraryEntries.indexOf(libraryEntry), libraryEntry);
        }else {
            mLibraryEntries.add(libraryEntry);
        }
    
}