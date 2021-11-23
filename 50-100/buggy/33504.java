@org.junit.Test
public void testTokenExceptions() {
    runExceptionalTokenTest(".");
    runExceptionalTokenTest("");
    runExceptionalTokenTest("   ");
    runExceptionalTokenAssertion("counterclockwise", tokens.KeywordToken.class);
    runExceptionalTokenAssertion("123", tokens.VariableToken.class);
    runExceptionalTokenAssertion("04", tokens.IntegerToken.class);
    runExceptionalTokenAssertion("91238", tokens.IntegerToken.class);
}