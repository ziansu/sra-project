@org.junit.Test
public void builder_test() {
    com.afollestad.ason.Ason ason = new com.afollestad.ason.Ason().put("person._id", 3).put("person.name", "Aidan").put("person.age", 21);
    assertEquals(3, ason.get("person._id"));
    assertEquals("Aidan", ason.get("person.name"));
    assertEquals(21, ason.get("person.age"));
    java.lang.String output = "{\"person\":{\"name\":\"Aidan\",\"_id\":3,\"age\":21}}";
    assertEquals(output, ason.toString());
}