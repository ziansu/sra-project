@java.lang.Override
public void read(net.game.unit.Player player) {
    java.lang.String word = player.getConnection().readString();
    net.Server.addNewWhoRequest(new net.thread.chatcommand.Who(word, player.getConnection()));
}