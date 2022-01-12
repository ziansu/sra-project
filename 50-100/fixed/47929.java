public static final wci.frontend.Token getNextToken() {
    if ((wci.frontend.TypeScriptParser.token.next) != null)
        wci.frontend.TypeScriptParser.token = wci.frontend.TypeScriptParser.token.next;
    else
        wci.frontend.TypeScriptParser.token = wci.frontend.TypeScriptParser.token.next = wci.frontend.TypeScriptParser.token_source.getNextToken();
    
    wci.frontend.TypeScriptParser.jj_ntk = -1;
    (wci.frontend.TypeScriptParser.jj_gen)++;
    return wci.frontend.TypeScriptParser.token;
}