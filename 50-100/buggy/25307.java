@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.String barkod = txtBarkod.getText();
    try {
        if (ba.unsa.etf.si.app.Inventura.Model.ValidacijaArtikla.validirajBarkod(txtBarkod.getText())) {
            ba.unsa.etf.si.app.Inventura.Model.Artikal art = ba.unsa.etf.si.app.Inventura.Kontroleri.ArtikliKontroler.nadjiBarKod(barkod);
            ba.unsa.etf.si.app.Inventura.Kontroleri.ArtikliKontroler.izbrisi(art.getId());
            javax.swing.JOptionPane.showMessageDialog(null, "Artikal uspljesno izbrisan");
        }
    } catch (java.lang.Exception e1) {
        ba.unsa.etf.si.app.Inventura.GUI.BrisanjeArtikla.logger.info(e1);
        javax.swing.JOptionPane.showMessageDialog(null, "Artikal nije u bazi");
    }
}