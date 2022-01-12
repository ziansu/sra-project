@org.junit.Test
public void test_remove_dot_notation() {
    com.afollestad.ason.Ason ason = new com.afollestad.ason.Ason().put("_id", 3).put("name", "Aidan").put("age", 21).put("spouse.name", "Waverly").put("spouse.age", 19);
    ason.remove("spouse.age");
    ason.remove("spouse.nonexisting.test");
    org.junit.Assert.assertEquals(("{\"name\":\"Aidan\",\"_id\":3,\"age\":21," + "\"spouse\":{\"name\":\"Waverly\"}}"), ason.toString());
}