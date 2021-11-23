model.TupleMomentSymbol popNewBoubleData(java.lang.Integer currentMoment) {
    model.TupleMomentSymbol boubleData = null;
    for (java.util.Map.Entry<java.lang.Integer, java.lang.String> entry : track.entrySet()) {
        java.lang.Integer entryMoment = entry.getKey();
        java.lang.String symbol = entry.getValue();
        if (isAbout(currentMoment, entryMoment)) {
            boubleData = new model.TupleMomentSymbol(entryMoment, symbol);
            break;
        }
    }
    track.remove(boubleData.getMoment());
    return boubleData;
}