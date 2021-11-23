public void removeBook(assignment.Book book) {
    if ((catalogue.remove(book.getIsbn(), book)) == false) {
        java.lang.System.err.println("[ERR] Book not found.");
    }
}