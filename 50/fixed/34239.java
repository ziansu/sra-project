public void grantInvitePrivileges(long summonerId) {
    client.sendRpc(net.boreeas.riotapi.rtmp.services.LcdsGameInvitationService.SERVICE, "grantInvitePrivileges", summonerId);
}