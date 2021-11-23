@java.lang.Override
public java.util.List<com.aircon.model.Player> findAllPlayers(com.aircon.model.PlayerExample example) {
    java.util.List<com.aircon.model.Player> players = playerMapper.selectByExample(example);
    java.lang.System.out.println(("player:" + (players.size())));
    return players;
}