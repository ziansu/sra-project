public void initializeCache(entities.Library library, repositories.BookRepository bookRepo) {
    log.info("Cache creation initialized");
    java.util.List<entities.Book> bookList = dbAccessor.getBooks(library, bookRepo);
    dbAccessor.createCache(bookList, library.getName());
    log.info("Cache created");
}