public static com.bookshare.domain.Respond breakRecursiveRef(com.bookshare.domain.Respond respond) {
    com.bookshare.domain.Bookshelf bookshelf = respond.getBookshelf();
    if (bookshelf != null) {
        bookshelf.setDemand(null);
        bookshelf.setResponds(null);
        bookshelf.setUser(null);
    }
    com.bookshare.domain.Demand demand = respond.getDemand();
    if (demand != null) {
        demand.setBookshelf(null);
        demand.setResponds(null);
        demand.setUser(null);
    }
    return respond;
}