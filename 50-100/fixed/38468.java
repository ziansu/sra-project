@org.junit.Test
public void builder_index_test_one() {
    com.afollestad.ason.Ason ason = new com.afollestad.ason.Ason().put("_id", 3).put("name", "Aidan").put("pets.$0", "Kierra").put("pets.$1", "Elijah").put("pets.$2", "Olivia");
    assertEquals(("{\"pets\":" + ("[\"Kierra\",\"Elijah\",\"Olivia\"]," + "\"name\":\"Aidan\",\"_id\":3}")), ason.toString());
}