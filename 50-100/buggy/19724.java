public void lookupDictionary(java.lang.String word, boolean autoCorrection) {
    if ((word == null) || (word.equals("")))
        return ;
    
    if (word.contains(" "))
        word = word.split(" ")[0];
    
    new com.ece251.gongxl.transcanner.Translator.LookupThread(word, autoCorrection).start();
}