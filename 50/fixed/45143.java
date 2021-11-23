public static boolean retunIncludesSearch(java.lang.String searchPattern, java.lang.String text) {
    boolean itMatches;
    if (text.matches((("(.*)" + searchPattern) + "(.*)"))) {
        itMatches = true;
    }else
        itMatches = false;
    
    return itMatches;
}