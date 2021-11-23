public void skipTo(java.lang.String stmt, java.lang.String terminatingStr) throws java.lang.Exception {
    while ((!(scan.currentToken.tokenStr.equals("else"))) && (!(scan.currentToken.tokenStr.equals("endif")))) {
        scan.getNext();
    } 
}