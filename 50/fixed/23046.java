public void checkForNewBoubles(java.lang.Integer currentMoment) {
    model.TupleMomentSymbol momentSymbol = music.popNewBoubleData(currentMoment);
    if (momentSymbol != null) {
        addBouble(momentSymbol.getMoment(), momentSymbol.getSymbol());
    }
}