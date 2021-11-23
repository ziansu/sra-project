@org.junit.Test
public void shouldGetNullBookById() throws java.lang.Exception {
    org.junit.Assert.assertEquals(null, bookStorageService.getBookById(10));
}