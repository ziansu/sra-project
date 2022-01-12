public boolean provjeriDaLiPostojiIstiKorisnik(java.lang.String username) {
    java.util.List<app.vrtic.Service.Korisnik> k = dajKorisnike();
    for (int i = 0; i < (k.size()); i++) {
        if ((k.get(i).getKorisnickoIme()) == username) {
            return true;
        }
    }
    return false;
}