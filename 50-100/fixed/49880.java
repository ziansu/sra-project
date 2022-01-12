public static com.bookshare.domain.Bookshelf breakRecursiveRef(com.bookshare.domain.Bookshelf bookshelf) {
    if (bookshelf != null) {
        com.bookshare.domain.Demand demand = bookshelf.getDemand();
        if (demand != null) {
            demand.setBookshelf(null);
            demand.setResponds(null);
            demand.setUser(null);
        }
    }
    return bookshelf;
}