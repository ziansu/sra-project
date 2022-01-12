@org.junit.Test
public void builder_index_test_three() {
    com.afollestad.ason.Ason ason = new com.afollestad.ason.Ason().put("_id", 1).put("people.$0.name", "Aidan").put("people.$0.pets.$0", "Kierra").put("people.$0.pets.$1", "Elijah").put("people.$0.pets.$2", "Olivia");
    org.junit.Assert.assertEquals(("{\"_id\":1," + ((((("\"people\":[" + "{\"pets\":") + "[\"Kierra\",\"Elijah\",\"Olivia\"],") + "\"name\":\"Aidan\"}") + "]") + "}")), ason.toString());
}