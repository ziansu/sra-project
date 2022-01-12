public java.util.ArrayList<edu.truman.CIRIL.Word> assembleWordList() {
    openEverything();
    while (findPrefixes());
    while (findSuffixes());
    if (!((baseWord.length()) == 0))
        fixWord();
    
    checkWord();
    wordList.add(dict.define(new edu.truman.CIRIL.Word(baseWord, edu.truman.CIRIL.Word.WordType.BASE)));
    wordList.add(dict.define(new edu.truman.CIRIL.Word(originalWord, edu.truman.CIRIL.Word.WordType.ORG)));
    closeEverything();
    return wordList;
}