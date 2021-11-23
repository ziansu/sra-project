public boolean pinSetzen(final data.Kasten[] kaesten, final int feldIndex, final int kastenIndex) {
    boolean kastenGewonnen = false;
    boolean spielGewonnen = false;
    kaesten[kastenIndex].getFelder()[feldIndex].setPin(new data.Pin(this));
    kastenGewonnen = pruefeKasten(kaesten[kastenIndex]);
    pinLoeschen(kaesten);
    if (kastenGewonnen == true)
        spielGewonnen = pruefeSpielfeld(kaesten);
    
    return spielGewonnen;
}