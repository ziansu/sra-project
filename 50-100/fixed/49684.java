public java.lang.String Leggi() throws eccezioni.GiocatoreDisconnessoException, java.io.IOException {
    java.lang.String letto;
    try {
        letto = daGiocatore.readLine();
        if (letto == null) {
            throw new eccezioni.GiocatoreDisconnessoException();
        }
    } catch (java.net.SocketTimeoutException e) {
        return null;
    }
    return letto;
}