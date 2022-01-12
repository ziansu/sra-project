public void returnBooks(java.lang.String bookTitle) {
    for (com.twu.biblioteca.Book book : books) {
        if (!(java.util.Objects.equals(book.getTitle(), bookTitle))) {
            if (book.checkOut()) {
                java.lang.System.out.println("Thank you for returning the book");
                return ;
            }
        }else {
            java.lang.System.out.println("That is not a valid book to return.");
            return ;
        }
    }
}