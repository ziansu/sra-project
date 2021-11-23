private void speicherePasswort() {
    java.lang.String passwort = pfPasswort.getText();
    if ((passwort.length()) >= 5) {
        c.speichereZugang(passwort);
        window.close();
        mainFrame.showWindow();
    }else {
        lAnzeige.setText("Mindestlänge von 5 Zeichen nötig für das Passwort!");
    }
}