public static ba.unsa.etf.si.app.Inventura.Model.KlasaArtikla nadjiIme(java.lang.String naziv) throws java.lang.Exception {
    ba.unsa.etf.si.app.Inventura.Kontroleri.KlasaArtikalaKontroler.openSession();
    java.util.List<java.lang.Object> klase = ba.unsa.etf.si.app.Inventura.Kontroleri.KlasaArtikalaKontroler.s.createCriteria(ba.unsa.etf.si.app.Inventura.Model.KlasaArtikla.class).add(org.hibernate.criterion.Restrictions.like("naziv", naziv)).list();
    if ((klase.size()) == 0) {
        return null;
    }
    ba.unsa.etf.si.app.Inventura.Model.KlasaArtikla pronadjenaKlasa = ((ba.unsa.etf.si.app.Inventura.Model.KlasaArtikla) (klase.get(0)));
    return pronadjenaKlasa;
}