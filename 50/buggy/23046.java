public void checkForNewBoubles(java.lang.Integer currentMoment) {
    model.TupleMomentSymbol momentSymbol = music.popNewBoubleData(currentMoment);
    addBouble(momentSymbol.getMoment(), momentSymbol.getSymbol());
}