private dominio.giocatori.GiocatoreOnline giocatoreDaNome(java.lang.String nome) {
    for (dominio.giocatori.GiocatoreOnline giocatore : giocatori) {
        if (nome.equals(giocatore.getNome())) {
            return giocatore;
        }
    }
    return null;
}