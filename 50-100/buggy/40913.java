public java.lang.String translateWord(java.lang.String word, boolean isEnglish) {
    java.lang.String translation = "";
    if (isEnglish == true) {
        translation = french.searchTree(word).getFren();
    }else
        if (isEnglish == false) {
            translation = english.searchTree(word).getEng();
        }
    
}