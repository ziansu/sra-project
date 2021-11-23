@org.votingsystem.client.webextension.service.OnClose
public void onClose(org.votingsystem.client.webextension.service.Session session, org.votingsystem.client.webextension.service.CloseReason closeReason) {
    broadcastConnectionStatus(SocketMessageDto.ConnectionStatus.CLOSED);
}