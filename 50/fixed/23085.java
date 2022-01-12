@java.lang.Deprecated
public net.boreeas.riotapi.com.riotgames.platform.gameinvite.contract.LobbyStatus createArrangedBotTeamLobby(long queueId, java.lang.String difficulty) {
    return client.sendRpcAndWait(net.boreeas.riotapi.rtmp.services.LcdsGameInvitationService.SERVICE, "createArrangedTeamLobby", queueId, difficulty);
}