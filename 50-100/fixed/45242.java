public static void elementy() {
    java.lang.Boolean w = JSONParser.wartosc();
    JSONParser.getNextToken();
    if (w && (JSONParser.currentToken.name.equals(TokenEnum.KONIEC_TABLICY))) {
        return ;
    }else
        if (w && (JSONParser.currentToken.name.equals(TokenEnum.SEPARATOR_REKORDOW))) {
            JSONParser.getNextToken();
            JSONParser.elementy();
        }else {
            TokenEnum[] te = new TokenEnum[]{ TokenEnum.SEPARATOR_REKORDOW , TokenEnum.KONIEC_TABLICY };
            JSONParser.err(te, "elementy");
        }
    
}