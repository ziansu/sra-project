private java.lang.String getKeywordValue(java.lang.String strValue) {
    java.lang.String strValueToFindKeyword = strValue.toLowerCase();
    int intRightArrowPosition = strValueToFindKeyword.indexOf(">");
    java.lang.String strKeywordValue = "";
    if (intRightArrowPosition > (-1)) {
        strKeywordValue = strValue.substring((intRightArrowPosition + 1));
    }else {
        strKeywordValue = strValue;
    }
    this.logger.add(("KeywordReturn: strKeywordValue " + strKeywordValue));
    return strKeywordValue;
}