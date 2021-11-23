@java.lang.Override
public void doOperation() {
    java.lang.String bookName = inputReader.read();
    if (library.checkOut(new com.thoughtworks.biblioteca.Book(bookName), currentUser)) {
        consoleDisplayFactory.getNewConsoleDisplay("Thank you! Enjoy the book").display();
    }else {
        consoleDisplayFactory.getNewConsoleDisplay("That book is not available.").display();
    }
}