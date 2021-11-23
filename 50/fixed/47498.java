@java.lang.Override
public void mouseClicked(java.awt.event.MouseEvent arg0) {
    try {
        mk = new ba.unsa.etf.si.app.SIDEVS.View.Admin.ModifikacijaKorisnika(_sesija);
        mk.prikazi();
    } catch (java.lang.Exception e) {
        ba.unsa.etf.si.app.SIDEVS.View.Admin.PocetniEkran.logger.error(e);
    }
}