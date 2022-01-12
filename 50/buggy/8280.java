@org.junit.Test
public void search() throws java.lang.Exception {
    org.junit.Assert.assertEquals(((int) (userService.search("zhujing").get(0).getAge())), 21);
}