public org.aqua.card.model.Player getPlayer(int id) {
    try {
        org.aqua.card.model.Player player = playerConstructor.newInstance(id);
        player.name = playerNameMap.get(id);
        return player;
    } catch (java.lang.Exception e) {
    }
    return null;
}