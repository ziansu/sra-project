@org.junit.Test
public void test_remove_index_notation() {
    java.lang.String input = "{\"group_id\":1,\"title\":\"Hello, world!\"," + ("\"participants\":[{\"name\":\"Aidan\",\"id\":2}," + "{\"name\":\"Waverly\",\"id\":1}]}");
    com.afollestad.ason.Ason object = new com.afollestad.ason.Ason(input);
    object.remove("participants.$0");
    com.afollestad.ason.AsonArray<com.afollestad.ason.Ason> participants = object.get("participants");
    assertEquals(participants.size(), 1);
    assertEquals(participants.get(0).get("id"), 1);
    assertEquals(participants.get(0).get("name"), "Waverly");
}