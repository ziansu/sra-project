@org.junit.Test
public void shouldBorrowBook1() throws java.lang.Exception {
    boolean b = bookStorageService.borrowBookId(1);
    assertTrue(b);
    com.twu.biblioteca.model.Book bookById = bookStorageService.getBookById(1);
    assertEquals(0, bookById.getStatus());
}