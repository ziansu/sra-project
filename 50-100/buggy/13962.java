public int getMonthNum(java.lang.String month) {
    if (hasInDictionary(ParserConstants.MONTHS_LONG, month)) {
        return indexOf(month, ParserConstants.MONTHS_LONG);
    }else
        if (hasInDictionary(ParserConstants.MONTHS_SHORT, month)) {
            return indexOf(month, ParserConstants.MONTHS_LONG);
        }else {
            return -1;
        }
    
}