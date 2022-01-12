@org.junit.Test
public void from_string_test() {
    java.lang.String input = "{\"person\":{\"name\":\"Aidan\",\"_id\":3,\"age\":21}}";
    com.afollestad.ason.Ason ason = new com.afollestad.ason.Ason(input);
    assertEquals(ason.size(), 1);
    assertTrue(ason.equal("person.name", "Aidan"));
    assertTrue(ason.equal("person._id", 3));
    assertTrue(ason.equal("person.age", 21));
}