private void returnBook() {
    java.lang.String bookToReturn = io.waitForUserStringInput("Enter the book title: ", false);
    boolean returnSuccessful = bookList.returnByTitle(bookToReturn);
    if (returnSuccessful) {
        io.print("Thank you for returning the book.");
    }else {
        io.print("That is not a valid book to return.");
    }
}