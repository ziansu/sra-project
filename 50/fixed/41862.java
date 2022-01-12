@java.lang.Override
public interfaces.BookInterface getBook(java.lang.String bookTitle) {
    for (interfaces.BookInterface book : books) {
        if (book.getId().equals(bookTitle))
            return book;
        
    }
    return null;
}