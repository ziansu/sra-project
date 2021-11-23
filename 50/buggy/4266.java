public fr.upem.book.Book[] getAllBooks() {
    fr.upem.book.Book[] tmp = new fr.upem.book.Book[books.size()];
    books.values().toArray(tmp);
    return tmp;
}