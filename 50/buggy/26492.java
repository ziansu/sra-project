void setWord(java.lang.String word) {
    int counter = 0;
    for (it.uniroma1.lcl.cruciverba.CruciverbaBuilder.CPoint key : letters.keySet()) {
        letters.put(key, word.charAt(counter));
        counter++;
    }
    blank = false;
}