public void updateProbablesList(java.lang.String currentWord, int numOfCharsInCommon) {
    java.util.Iterator<java.lang.String> iter = probablesList.iterator();
    while (iter.hasNext()) {
        java.lang.String s = iter.next();
        if ((getNumberOfCharactersInCommon(s, currentWord)) != numOfCharsInCommon) {
            iter.remove();
        }
    } 
}