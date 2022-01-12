com.google.common.base.Optional<? extends com.forerunnergames.peril.common.net.packets.person.PlayerPacket> createAvailablePlayer() {
    if (shouldResetPlayers())
        resetPlayersKeepUnavailable();
    
    if (shouldResetPlayers())
        return com.google.common.base.Optional.absent();
    
    return com.google.common.base.Optional.of(new com.forerunnergames.peril.common.net.packets.defaults.DefaultPlayerPacket(com.forerunnergames.tools.common.id.IdGenerator.generateUniqueId().value(), nextAvailablePlayerName(), nextAvailablePlayerColor(), nextAvailablePlayerTurnOrder(), 0));
}