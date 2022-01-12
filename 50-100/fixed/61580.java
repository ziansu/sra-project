@org.junit.Test
public void testSearch() {
    application.Command cmd = new application.Command("search laundry", store, parse);
    application.Feedback actual = cmd.execute();
    java.util.ArrayList<application.Task> expected = new java.util.ArrayList<application.Task>();
    expected.add(new application.Task("t5", "do laundry", "none", "low", "personal"));
    assertEquals(expected.toString(), actual.getData().toString());
}