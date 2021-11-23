private static boolean hasName() {
    java.lang.String mayBeName = dooyit.parser.EditParser.userInput.split("\\s+")[1];
    return ((!(mayBeName.equals(dooyit.parser.EditParser.MARKER_DEADLINE.trim()))) && (!(mayBeName.equals(dooyit.parser.EditParser.MARKER_TIME_END.trim())))) && (!(mayBeName.equals(dooyit.parser.EditParser.MARKER_TIME_START.trim())));
}