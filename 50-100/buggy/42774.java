@java.lang.Override
public java.util.List FindByParameter(java.util.UUID id, int parameter, int page) {
    if (parameter == 0) {
        java.lang.String sql1 = ((("SELECT SPELLING,DEFINITION,SENTENCES,DATE FROM WORDLIST.WORD WHERE ID = '" + (id.toString())) + "' ORDER BY DATE DESC LIMIT ") + page) + ",10";
        return find(sql1);
    }else
        if (parameter == 1) {
            java.lang.String sql2 = ((("SELECT SPELLING,DEFINITION,SENTENCES,DATE FROM WORDLIST.WORDS WHERE ID = '" + (id.toString())) + "' ORDER BY SPELLING LIMIT ") + page) + ",10";
            return find(sql2);
        }else
            return null;
        
    
}