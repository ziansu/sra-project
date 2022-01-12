private void printAllBooks() {
    java.util.List<botscrew.test.entity.Book> allBooks = bookService.getAllBooks();
    if (allBooks.isEmpty()) {
        java.lang.System.out.println("Nothing in here!");
    }else {
        allBooks.sort(java.util.Comparator.comparing(Book::getName));
        allBooks.forEach(java.lang.System.out::println);
    }
}