@org.junit.Test
public void getBookById() throws java.lang.Exception {
    com.twu.biblioteca.model.Book shouldBe = new com.twu.biblioteca.model.Book(1, "Java Language", "GoodWeather", "2005");
    org.junit.Assert.assertEquals(shouldBe, bookStorageService.getBookById(1));
}