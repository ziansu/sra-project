@java.lang.Override
public void update(java.util.Observable o, java.lang.Object arg) {
    if (o == (_spiel)) {
        if (arg instanceof ConsoleUI.Mensch) {
            zieheMitMensch();
        }else
            if (arg instanceof ConsoleUI.KI) {
                zieheMitKI();
            }else {
                zeigeZwischenstand();
                warteAufBestaetigung();
            }
        
        spielFortsetzen();
    }
}