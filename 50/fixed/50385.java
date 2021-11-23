private void zieheMitKI() {
    spielstandAnzeigen();
    java.util.List<ConsoleUI.Zug> zuege = _spiel.getMoeglicheZuege();
    java.lang.System.out.println(zuege.toString());
    _spiel.zieheKI();
}