public hello.StateUpdateMessage toPrivateMessage(java.lang.String userName) {
    hello.StateUpdateMessage stateUpdateMessage = new hello.StateUpdateMessage();
    stateUpdateMessage.setPrivateMessage(true);
    stateUpdateMessage.setSprites(new java.util.ArrayList<hello.Sprite>());
    hello.Player player = players.get(userName);
    for (hello.Card card : player.getCards()) {
        stateUpdateMessage.getSprites().add(card.getSprite());
    }
    return stateUpdateMessage;
}