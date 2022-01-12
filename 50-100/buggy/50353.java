public static java.lang.String returnLetterPairedText(java.lang.String text) {
    int count = 0;
    java.lang.String temp = text;
    for (int i = 0; i < (text.length()); i++)
        if ((mx.Iteso.MathUtils.getIndex(text.charAt(i))) >= 0)
            count++;
        
    
    if ((count % 2) == 0)
        temp += "x";
    
    return temp;
}