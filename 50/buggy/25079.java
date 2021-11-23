public void unesi(java.lang.String korisnik, java.lang.String poruka) {
    com.twitter.poruke.TwitterPoruka tp = new com.twitter.poruke.TwitterPoruka();
    tp.setKorisnik("korisnik");
    tp.setPoruka(poruka);
    poruke.addLast(tp);
}