de.mca.model.interfaces.IsPlayer getPlayer(de.mca.model.enums.PlayerType playerType) {
    return getPlayerActive().equals(PlayerType.HUMAN) ? getPlayerHuman() : getPlayerComputer();
}