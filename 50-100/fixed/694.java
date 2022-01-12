public boolean provjeriDaLiPostojiIstiKorisnik(java.lang.String username) {
    java.util.ArrayList<app.vrtic.Service.Korisnik> k = dajKorisnike();
    for (int i = 0; i < (k.size()); i++) {
        if (k.get(i).getKorisnickoIme().equals(username)) {
            return true;
        }
    }
    return false;
}