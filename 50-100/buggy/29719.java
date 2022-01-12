@org.junit.Test
public void builder_index_test_two() {
    com.afollestad.ason.Ason ason = new com.afollestad.ason.Ason().put("_id", 3).put("name", "Aidan").put("pets.$0.id", 1).put("pets.$0.name", "Kierra").put("pets.$1.id", 2).put("pets.$1.name", "Elijah").put("pets.$2.id", 3).put("pets.$2.name", "Olivia");
    org.junit.Assert.assertEquals(("{\"pets\":[" + ((("{\"name\":\"Kierra\",\"id\":1}," + "{\"name\":\"Elijah\",\"id\":2},") + "{\"name\":\"Olivia\",\"id\":3}],") + "\"name\":\"Aidan\",\"_id\":3}")), ason.toString());
}