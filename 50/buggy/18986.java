@java.lang.Override
public rosa.archive.model.Book loadBook(java.lang.String collection, java.lang.String book) throws java.io.IOException {
    return archiveStore.loadBook(archiveStore.loadBookCollection(collection, null), book, null);
}