private boolean isEvent() {
    return (isUninitialized(userInput.lastIndexOf(dooyit.parser.AddParser.MARKER_START_EVENT))) && (isUninitialized(userInput.lastIndexOf(dooyit.parser.AddParser.MARKER_END_EVENT)));
}