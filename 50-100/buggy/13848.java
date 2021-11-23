private java.lang.String formatWord(int word) {
    java.lang.String s = word + "";
    while ((s.length()) < (((Simpletron.MAX_WORD_SIZE) + "").length()))
        s = "0" + s;
    
    if (word >= 0)
        s = "+" + s;
    else
        s = "-" + s;
    
    return s;
}