public void postaviListu() {
    java.util.List<ba.unsa.etf.si.app.Inventura.Model.TipZaposlenika> zaposlenik = ba.unsa.etf.si.app.Inventura.Kontroleri.TipZaposlenikaKontroler.lista();
    javax.swing.DefaultListModel model = new javax.swing.DefaultListModel();
    for (ba.unsa.etf.si.app.Inventura.Model.TipZaposlenika a : zaposlenik) {
        model.addElement(a.getIme());
    }
    listKorisnici.setModel(model);
}