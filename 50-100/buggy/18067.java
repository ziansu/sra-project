@java.lang.Override
public boolean addRating(java.lang.String uid, java.lang.String bid, int rating, java.lang.String review) {
    databaseSupport.DatabaseSupport db = new databaseSupport.DatabaseSupport();
    interfaces.BookInterface book = db.getBook(bid);
    models.Review r = new models.Review(java.lang.Integer.parseInt(bid), rating, review);
    if (!(book.addReview(r))) {
        return false;
    }
    return db.putBook(book);
}