@org.junit.Test
public void testStdGeneric() {
    assertEval("{ standardGeneric(42) }");
    assertEval("{ standardGeneric(character()) }");
    assertEval("{ standardGeneric(\"\") }");
    assertEval("{ standardGeneric(\"foo\", 42) }");
    assertEval(Output.IgnoreErrorContext, "{ x<-42; class(x)<-character(); standardGeneric(\"foo\", x) }");
}