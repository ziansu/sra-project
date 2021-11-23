@org.junit.Test
public void array_get_path_test() {
    java.lang.String input = "[{\"body\":\"Hello, world\",\"sender\":{\"name\":\"Aidan\",\"id\":2}}," + ("{\"body\":\"Hello, world\",\"sender\":{\"name\":\"Waverly\",\"id\":1}}," + "{\"body\":\"Hello, world\",\"sender\":{\"name\":\"Jeff\",\"id\":3}}]");
    com.afollestad.ason.AsonArray array = new com.afollestad.ason.AsonArray(input);
    assertEquals("Waverly", array.get(1, "sender.name"));
    assertEquals(3, array.get(2, "sender.id"));
}