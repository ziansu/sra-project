public void addLibraryEntry(final com.charlesmadere.hummingbird.models.AnimeLibraryEntry libraryEntry) {
    if ((mLibraryEntries) == null) {
        mLibraryEntries = new java.util.ArrayList<>();
        mLibraryEntries.add(libraryEntry);
    }else
        if (mLibraryEntries.contains(libraryEntry)) {
            mLibraryEntries.get(mLibraryEntries.indexOf(libraryEntry)).update(libraryEntry);
        }else {
            mLibraryEntries.add(libraryEntry);
        }
    
}