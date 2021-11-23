@org.junit.Test
public void testNestedLambda() throws wyvern.tools.parsing.coreparser.ParseException {
    java.lang.String input = "val obj = new\n" + (("  val x = 5\n" + "  val f = () => (() => this.x)()\n") + "obj.f()\n");
    testPyFromInput(input, "5", true);
}