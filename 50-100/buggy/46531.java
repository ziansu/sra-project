@org.junit.Test
public void testComplex() {
    fxc.Element note = new fxc.Element("note").add("to", "Tove").add("from", "Jani").add("heading", "Reminder").add("body", "This is a very long complex note that includes a multi lined string and styling");
    fxc.Element test = new fxc.XMLHeader(true).add(note);
    org.junit.Assert.assertEquals(complex, test.toString(new fxc.Formatter().setPrettyPrint(true)));
}