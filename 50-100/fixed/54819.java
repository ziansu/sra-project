@org.junit.Before
public void setUp() throws java.lang.Exception {
    this.playerName = "Fred";
    this.bet = 5;
    this.balance = 5;
    this.limit = 0;
    this.player = new game.Player(this.playerName, this.balance);
    this.player.setLimit(this.limit);
}