@org.junit.Test
public void getDescriptionTest() {
    java.lang.String param;
    param = "";
    task.setDescription(param);
    assertEquals(param, task.getDescription());
}