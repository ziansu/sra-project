public double calculatePlayersIndividualTankWN8(int tankId) {
    java.util.List<org.krugdev.wn8.TankItem> tankItems = readPlayersTanks();
    for (org.krugdev.wn8.TankItem tankItem : tankItems) {
        if ((tankItem.getTankId()) == tankId) {
            return org.krugdev.wn8.WN8Formula.calculate(tankItems, tanksExpectedVal);
        }
    }
    throw new java.lang.IllegalArgumentException(((("Could not find tank with ID: " + tankId) + " for player: ") + (PLAYER_ID)));
}