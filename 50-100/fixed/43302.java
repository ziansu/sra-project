public boolean isValidRangeKeyWord(java.lang.String keyword) {
    if ((keyword == null) || (keyword.isEmpty())) {
        return false;
    }else {
        keyword = keyword.trim();
        return ((keyword.equalsIgnoreCase(ParserConstants.STRING_HYPHEN)) || (keyword.equalsIgnoreCase(ParserConstants.STRING_TO))) && ((dateList.size()) > (ParserConstants.MIN_SIZE));
    }
}