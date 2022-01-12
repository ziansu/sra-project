@org.junit.Test
public void should_return_4_books_when_add_one() {
    java.lang.Iterable<bookshelf.model.Book> books = bookService.addBook(new bookshelf.model.Book("9780132350555", "Test Driven Development by Example", "Kent Beck", 30.32));
    for (bookshelf.model.Book book : books) {
        org.junit.Assert.assertThat(book, org.hamcrest.core.Is.is(bookRepository.BOOKS_MAP.get(book.getIsbn())));
    }
}