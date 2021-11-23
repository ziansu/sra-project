public void winUitkomst() {
    if ((beurten) == false) {
        gewonnen();
        einde = true;
    }else {
        verloren();
        einde = true;
    }
}