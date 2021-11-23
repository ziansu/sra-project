public static java.lang.String returnLetterPairedText(java.lang.String text) {
    int count = 0;
    java.lang.String temp = text.toUpperCase();
    for (int i = 0; i < (temp.length()); i++)
        if ((mx.Iteso.MathUtils.getIndex(temp.charAt(i))) >= 0)
            count++;
        
    
    if ((count % 2) == 1)
        temp += "x";
    
    return temp.toLowerCase();
}