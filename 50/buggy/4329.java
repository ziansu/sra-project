@org.junit.Test
public void testIdentityCall() throws wyvern.tools.parsing.coreparser.ParseException {
    java.lang.String input = "val obj = new\n" + ("    def id(x:system.Int) : system.Int = x\n" + "obj.id(13)\n");
    testPyFromInput(input, "13");
}