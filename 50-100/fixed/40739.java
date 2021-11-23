public static int addWord(java.lang.String word) {
    if ((word == null) || (word.isEmpty()))
        return -1;
    
    if ((datastructure.WordsDictionary.wordsToIndexDictionary.get(word.charAt(0))) == null) {
        return datastructure.WordsDictionary.addNewWord(word);
    }else {
        if (!(datastructure.WordsDictionary.wordsToIndexDictionary.get(word.charAt(0)).containsKey(word))) {
            return datastructure.WordsDictionary.addNewWord(word);
        }
    }
    return -2;
}