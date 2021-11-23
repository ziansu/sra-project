public static ba.unsa.etf.si.app.Inventura.Model.TipZaposlenika provjerUserPass(java.lang.String username, java.lang.String password) throws java.lang.Exception {
    try {
        ba.unsa.etf.si.app.Inventura.Model.TipZaposlenika zaposlenik = ba.unsa.etf.si.app.Inventura.Kontroleri.TipZaposlenikaKontroler.nadjiKorisnickoIme(username);
        if (zaposlenik.getLozinka().equals(password)) {
            return zaposlenik;
        }
    } catch (java.lang.Exception i) {
        ba.unsa.etf.si.app.Inventura.GUI.LogInScreen.logger.info(i);
    }
    return null;
}