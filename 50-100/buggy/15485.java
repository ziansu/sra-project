@org.junit.Test
public void from_string_test() {
    java.lang.String input = "{\"person\":{\"name\":\"Aidan\",\"_id\":3,\"age\":21}}";
    com.afollestad.ason.Ason ason = new com.afollestad.ason.Ason(input);
    org.junit.Assert.assertEquals(ason.size(), 1);
    org.junit.Assert.assertTrue(ason.equal("person.name", "Aidan"));
    org.junit.Assert.assertTrue(ason.equal("person._id", 3));
    org.junit.Assert.assertTrue(ason.equal("person.age", 21));
}