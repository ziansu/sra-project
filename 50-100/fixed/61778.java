private boolean isInWordList(java.lang.String word, java.util.ArrayList<java.lang.String> strLst) {
    int counter = 0;
    while (counter < (strLst.size())) {
        if ((strLst.get(counter).compareTo(word)) == 0) {
            return true;
        }
        counter++;
    } 
    return false;
}