public java.lang.String stringWord() {
    java.lang.String returnWord = "";
    for (int i = 0; i < (word.size()); i++) {
        returnWord += this.word.get(i).getKey();
    }
    return returnWord;
}