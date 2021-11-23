public static void generateWarning(parser.Token t, parser.JDCParser parser, java.lang.String message) {
    java.lang.String warning = (((((("Warning: encountered \"" + (t.image)) + "\" at line ") + (t.endLine)) + ", column ") + (t.endColumn)) + ": ") + message;
    parser.addWarning(warning);
}