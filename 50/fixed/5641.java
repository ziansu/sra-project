@java.lang.Override
public java.util.List<com.aircon.model.Player> findAllPlayers(com.aircon.model.PlayerExample example) {
    java.util.List<com.aircon.model.Player> players = playerMapper.selectByExample(example);
    return players;
}