@org.testng.annotations.Test
public void testUndefinedDeclarationSingle() throws java.lang.Exception {
    assertSemantics("undefinedDeclarationSingle.txt", 2, "Undefined declaration should throw an error");
}