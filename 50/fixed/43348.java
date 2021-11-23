@org.testng.annotations.Test
public void testUndefinedDeclarationSingle() throws java.lang.Exception {
    assertSemantics("undefinedDeclarationSingle.txt", 1, "Undefined declaration should throw an error");
}