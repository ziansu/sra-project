public void sendStartBattle(java.util.LinkedList<Player> players) {
    java.lang.String s = Base64Codec.Encode(players.size());
    for (Player player : players) {
        s += Base64Codec.Encode(player.id);
    }
    ctx.writeAndFlush(((Base64Codec.EncodeToChar(ServerCommands.START_BATTLE)) + "\n"));
}