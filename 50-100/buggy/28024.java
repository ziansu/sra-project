public static boolean isGF(java.lang.String word) throws java.io.IOException {
    if ((utils.GFBF.GFLexicon.isEmpty()) || (utils.GFBF.BFLexicon.isEmpty()))
        utils.GFBF.intializeLexicon();
    
    if (utils.GFBF.GFLexicon.contains(word))
        return true;
    
    return false;
}