private int getFirstOccurrenceOf(int startIndex, java.lang.String... keywords) {
    java.lang.String lowerCaseInput = input.substring(startIndex).toLowerCase();
    java.util.regex.Matcher matcher = seedu.commando.logic.parser.SequentialParser.WORD_PATTERN.matcher(lowerCaseInput);
    loop : while (matcher.find()) {
        for (java.lang.String keyword : keywords) {
            if (matcher.group("word").equals(keyword.trim().toLowerCase())) {
                return (matcher.start()) + startIndex;
            }
        }
    } 
    return input.length();
}