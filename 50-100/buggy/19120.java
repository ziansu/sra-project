@javax.websocket.OnMessage
public void onMessage(net.bubbaland.megaciv.client.ServerMessage message, javax.websocket.Session session) {
    java.lang.String messageType = message.getClass().getSimpleName();
    switch (messageType) {
        case "GameDataMessage" :
            this.game = ((net.bubbaland.megaciv.client.GameDataMessage) (message)).getGame();
        case "UserListMessage" :
            this.userList = ((net.bubbaland.megaciv.client.UserListMessage) (message)).getUserList();
        default :
    }
}