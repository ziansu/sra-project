@org.junit.Test
public void testTokenExceptions() {
    runExceptionalTokenTest(".");
    runExceptionalTokenTest("");
    runExceptionalTokenTest("   ");
    runExceptionalTokenTest("04");
    runExceptionalTokenAssertion("counterclockwise", tokens.KeywordToken.class);
    runExceptionalTokenAssertion("123", tokens.VariableToken.class);
    runExceptionalTokenAssertion("91238", tokens.IntegerToken.class);
}