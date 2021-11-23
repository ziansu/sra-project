public hello.StateUpdateMessage toPrivateMessage(java.lang.String userName) {
    hello.StateUpdateMessage stateUpdateMessage = new hello.StateUpdateMessage();
    stateUpdateMessage.setPrivateMessage(true);
    stateUpdateMessage.setSprites(new java.util.HashMap<java.lang.String, hello.Sprite>());
    hello.Player player = players.get(userName);
    for (hello.Card card : player.getCards()) {
        stateUpdateMessage.getSprites().put(card.getId(), card.getSprite());
    }
    return stateUpdateMessage;
}