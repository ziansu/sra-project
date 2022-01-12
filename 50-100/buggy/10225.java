@org.junit.Test
public void run8() throws java.lang.Throwable {
    java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
    list.add("Did you try and take us back to our own time? DOCTOR: Well, I got you away from that other time, didn't I? IAN: That isn't what I asked you.");
    java.util.Collection<java.lang.String> lines = org.swtk.eng.preprocess.functions.CreateSentences.process(list);
    org.junit.Assert.assertNotNull(lines);
    for (java.lang.String line : lines)
        java.lang.System.err.println(line);
    
    org.junit.Assert.assertEquals(3, lines.size());
}