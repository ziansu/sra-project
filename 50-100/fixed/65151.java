private boolean isDurationTask(java.lang.String timeSegment) {
    if (((timeParser.parse(timeSegment).size()) == 2) && ((containsWholeWord(timeSegment, main.java.parser.AddCommandParser.DURATION_FLAG_FROM)) || (containsWholeWord(timeSegment, main.java.parser.AddCommandParser.DURATION_FLAG_TO)))) {
        return true;
    }
    return false;
}