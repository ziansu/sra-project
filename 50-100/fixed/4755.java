public static java.util.ArrayList<java.lang.String> ListAnagrams(java.lang.String testWord, Dictionary dictionary) {
    Anagram.anagramList.clear();
    Anagram.FindListAnagrams(testWord.toLowerCase().toCharArray(), dictionary, ((testWord.length()) - 1));
    return Anagram.anagramList;
}