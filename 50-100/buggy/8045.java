protected static java.lang.String singleSearch(java.lang.String keyword, java.lang.String text, boolean i) {
    java.lang.String returnString = "";
    for (java.lang.String s : poormansgrep.BonusProject.Search.search(keyword, text, i)) {
        if (s != null)
            returnString += s + "\n";
        
    }
    return returnString;
}