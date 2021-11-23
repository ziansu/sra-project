private int getClosingBracketStartOffset(int startOffset, boolean isCDATA) {
    int counter = startOffset + 1;
    while (startOffset < (content.length())) {
        if (((content.charAt(counter)) == '>') && (bracketsBefore(isCDATA, counter))) {
            return counter;
        }
        counter++;
    } 
    throw new java.lang.IllegalStateException("No \">\" found.");
}