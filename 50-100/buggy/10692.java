@org.junit.Test
public void getThread_Id_Page() throws java.lang.Exception {
    java.lang.Thread thread = mapper.getThread(1, 7);
    assertNotNull(thread.getPosts());
    assertEquals(thread.getPosts().getPage().intValue(), 7);
    assertEquals(180, thread.getPosts().getOffset().intValue());
}