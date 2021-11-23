public static boolean IfUniqueWord(java.util.List<ContainerClasses.StringAndTag> listOfWords, java.lang.String word) {
    boolean retVal = false;
    for (ContainerClasses.StringAndTag currentWord : listOfWords) {
        if ((currentWord.word.compareToIgnoreCase(word)) == 0) {
            retVal = true;
        }
    }
    return retVal;
}