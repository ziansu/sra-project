public net.boreeas.riotapi.com.riotgames.platform.gameinvite.contract.LobbyStatus createArrangedTeamLobby(long queueId) {
    return client.sendRpcAndWait(net.boreeas.riotapi.rtmp.services.LcdsGameInvitationService.SERVICE, "createArrangedTeamLobby", queueId);
}