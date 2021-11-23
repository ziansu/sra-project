public static boolean isExist(java.lang.String word) {
    if ((word == null) || (word.isEmpty()))
        return false;
    
    if ((datastructure.WordsDictionary.wordsToIndexDictionary.get(word.charAt(0))) == null) {
        return false;
    }else {
        if (datastructure.WordsDictionary.wordsToIndexDictionary.get(word.charAt(0)).containsKey(word)) {
            return false;
        }
        return true;
    }
}