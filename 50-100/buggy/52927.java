private java.lang.String[] findMostCertainWord() {
    java.lang.String[] mostCertainWord = words.get(0);
    for (java.lang.String[] word : words) {
        if ((guessTable.getWord(word).size()) < (guessTable.getWord(mostCertainWord).size())) {
            mostCertainWord = word;
        }
    }
    printArray(mostCertainWord);
    java.lang.System.out.println(("8 is " + (hypTable.getHyp("8"))));
    return mostCertainWord;
}