private void testCase(java.lang.String input, java.lang.String output) throws java.lang.Exception {
    utils.TestUtils.RedirectStdinToString(input);
    java.io.ByteArrayOutputStream os = utils.TestUtils.RedirectStdoutToString();
    parser.Interpreter.Main(new java.lang.String[]{  });
    assertEquals(os.toString(), output);
}