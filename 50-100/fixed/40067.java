public void postaviListu() {
    java.util.List<ba.unsa.etf.si.app.Inventura.Model.TipZaposlenika> zaposlenik = ba.unsa.etf.si.app.Inventura.Kontroleri.TipZaposlenikaKontroler.lista();
    javax.swing.DefaultListModel<ba.unsa.etf.si.app.Inventura.Model.TipZaposlenika> model = new javax.swing.DefaultListModel<ba.unsa.etf.si.app.Inventura.Model.TipZaposlenika>();
    for (ba.unsa.etf.si.app.Inventura.Model.TipZaposlenika a : zaposlenik) {
        model.addElement(a);
    }
    listKorisnici.setModel(model);
}