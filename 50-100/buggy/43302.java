public boolean isValidRangeKeyWord(java.lang.String keyword) {
    keyword = keyword.trim();
    return ((keyword.equalsIgnoreCase(ParserConstants.STRING_HYPHEN)) || (keyword.equalsIgnoreCase(ParserConstants.STRING_TO))) && ((dateList.size()) > (ParserConstants.MIN_SIZE));
}