@org.junit.Test
public void should_return_new_book_when_update_9780132350884() {
    bookshelf.model.Book book = bookService.updateBook(new bookshelf.model.Book("9780132350884", "Effective Java 2", "Joshua Bloch", 35.99));
    org.junit.Assert.assertThat(book.getName(), org.hamcrest.core.Is.is("Effective Java 2"));
}