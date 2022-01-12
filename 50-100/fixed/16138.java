private static boolean startsWithKeyword(java.lang.String line) {
    boolean retval = false;
    line.trim();
    for (int i = 0; i < (com.github.canbabel.canio.dbc.DbcReader.KEYWORDS.length); i++) {
        if (line.startsWith(com.github.canbabel.canio.dbc.DbcReader.KEYWORDS[i]))
            retval = true;
        
    }
    return retval;
}