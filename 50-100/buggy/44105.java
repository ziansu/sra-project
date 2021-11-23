@org.junit.Test
public void test_index_notation() {
    java.lang.String input = "{\"group_id\":1,\"title\":\"Hello, world!\"," + ("\"participants\":[{\"name\":\"Aidan\",\"id\":2}," + "{\"name\":\"Waverly\",\"id\":1}]}");
    com.afollestad.ason.Ason object = new com.afollestad.ason.Ason(input);
    org.junit.Assert.assertEquals("Waverly", object.get("participants.$1.name"));
    org.junit.Assert.assertEquals(2, object.get("participants.$0.id"));
}