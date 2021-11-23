protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_texas_holdem);
    thread = new android.os.Handler(android.os.Looper.getMainLooper());
    gamePlay();
    updatePlayerCards(deck.getCard(), deck.getCard());
    updateCommunityCards(deck.getCard(), deck.getCard(), deck.getCard(), deck.getCard(), null);
    showPlayers(java.lang.Integer.parseInt(getIntent().getStringExtra("numBots")));
}