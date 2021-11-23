public void checkIn(com.thoughtworks.biblioteca.Book book) {
    if (checkedOutBooks.contains(book)) {
        int bookIndex = checkedOutBooks.indexOf(book);
        availableBooks.add(checkedOutBooks.get(bookIndex));
        java.lang.System.out.println("Thank you for returning the book.");
    }else {
        java.lang.System.out.println("That is not a valid book to return.");
    }
}