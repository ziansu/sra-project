@org.junit.Test
public void testPretty() {
    fxc.Element note = new fxc.Element("note").add("to", "Tove").add("from", "Jani").add("heading", "Reminder").add("body", "Don't forget me this weekend!");
    org.junit.Assert.assertEquals(pretty, note.toString(new fxc.Formatter()));
}