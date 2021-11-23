protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_texas_holdem);
    thread = new android.os.Handler(android.os.Looper.getMainLooper());
    gamePlay();
    showPlayers(java.lang.Integer.parseInt(getIntent().getStringExtra("numBots")));
}