@org.junit.Test
public void testCreateBook() {
    Publisher publishe1 = new Publisher("John");
    Book book1 = new Book("Javabook", "John Java", publishe1, 1);
    org.junit.Assert.assertEquals("John Java", book1.getAuthor());
    org.junit.Assert.assertEquals(publishe1, book1.getPublisher());
    org.junit.Assert.assertEquals("Javabook", book1.getTitle());
}