private java.lang.String determineTimeSegment(java.lang.String content) {
    int timeIndex = getStartingIndexOfIdentifier(content);
    int priorityIndex = getStartingIndexOfPriority(content);
    java.lang.String timeSegment;
    if (timeIndex == (-1)) {
        timeSegment = EMPTY_STRING;
    }else
        if (priorityIndex == (main.java.parser.AddCommandParser.FIELD_NOT_EXIST)) {
            timeSegment = content.substring(timeIndex);
        }else {
            timeSegment = content.substring(timeIndex, (priorityIndex - 1));
        }
    
    timeSegment = formatTimeSegment(timeSegment);
    return timeSegment;
}