public void setCasilla(java.lang.String pPgn, com.jayktec.grafico.Principal.Pieza pPieza, int pInd) {
    pPgn = pPgn.substring(0, 2);
    java.lang.System.out.println(((((("SetCasilla pgn: " + pPgn) + " pieza: ") + pPieza) + " ind: ") + pInd));
    casillas[pInd] = new com.jayktec.grafico.Principal.Casilla();
    casillas[pInd].setPieza(pPieza);
    casillas[pInd].setPgn(pPgn);
}