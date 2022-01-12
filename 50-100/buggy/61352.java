private void promptForBookCheckout() {
    java.lang.System.out.println("This is the list of books available, type in the name of the book you wish to checkout");
    showAvailableBookDetails();
    java.lang.String bookName = "";
    bookName = scanner.nextLine();
    if (library.canChangeStatus(bookName, library.getUnavailableBooks())) {
        library.checkoutBook(bookName);
        java.lang.System.out.println("Thank you, hope you enjoy your book");
    }else {
        java.lang.System.out.println("That book is unavailable");
    }
}