@org.junit.Test
public void getDescriptionTest() {
    task.setDescription(null);
    assertEquals("", task.getDescription());
    java.lang.String param;
    param = "";
    task.setDescription(param);
    assertEquals(param, task.getDescription());
}