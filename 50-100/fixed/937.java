@org.junit.Test
public void testNullBook() {
    Book book1 = new Book(null, null, null, 0);
    org.junit.Assert.assertNull(book1.getAuthor());
    org.junit.Assert.assertNull(book1.getPublisher());
    org.junit.Assert.assertNull(book1.getTitle());
}