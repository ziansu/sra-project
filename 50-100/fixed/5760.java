@org.junit.Test
public void returnBook() {
    lib.addBook("Programming rocks", "Miller");
    lib.takeBook("Programming rocks");
    lib.returnBook(lib.getCollection().get(0));
    assertEquals(lib.takeBook("Programming rocks"), lib.getCollection().get(0));
}