de.mca.model.interfaces.IsPlayer getPlayer(de.mca.model.enums.PlayerType playerType) {
    return playerType.equals(PlayerType.HUMAN) ? getPlayerHuman() : getPlayerComputer();
}