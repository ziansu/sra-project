public void register(edu.nju.treasuryArbitrage.model.ArbDetail arbDetail) {
    java.lang.String symbol = arbDetail.getSymbol();
    int index = 0;
    for (; index < (futuresCodes.length); index++) {
        if (futuresCodes[index].equals(arbDetail)) {
            break;
        }
    }
    arbDetails.set(index, arbDetail);
}