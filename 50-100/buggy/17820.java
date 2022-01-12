@java.lang.Override
public int bepaalBieding(java.util.ArrayList<nl.han.ica.ap.boerenbridge.kaart.Kaart> hand, java.util.ArrayList<java.lang.Integer> biedingen) {
    int bod = ((int) ((countSchoppen(hand)) * 0.67)) - (this.bodCounter);
    (this.bodCounter)++;
    return bod;
}