public boolean checkWordExistence(java.lang.String word) {
    if (wordList.isEmpty())
        return false;
    
    if (wordList.get(currentIndex).equals(word)) {
        currentIndex = (currentIndex) + 1;
        return true;
    }else {
        currentIndex = 0;
        return false;
    }
}