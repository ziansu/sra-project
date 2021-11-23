public static java.util.List<com.bookshare.domain.Bookshelf> breakRecursiveRef(java.util.List<com.bookshare.domain.Bookshelf> bookshelfs) {
    if (bookshelfs != null) {
        for (com.bookshare.domain.Bookshelf bookshelf : bookshelfs) {
            com.bookshare.domain.Bookshelf.breakRecursiveRef(bookshelf);
        }
    }
    return bookshelfs;
}