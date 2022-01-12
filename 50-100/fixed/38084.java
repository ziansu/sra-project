public static java.lang.Integer getWordIndex(java.lang.String word) {
    if ((word.length()) < 1)
        return -1;
    
    if ((datastructure.WordsDictionary.wordsToIndexDictionary.get(word.charAt(0))) == null) {
        return -1;
    }else {
        if (!(datastructure.WordsDictionary.wordsToIndexDictionary.get(word.charAt(0)).containsKey(word))) {
            return -1;
        }
        return datastructure.WordsDictionary.wordsToIndexDictionary.get(word.charAt(0)).get(word);
    }
}