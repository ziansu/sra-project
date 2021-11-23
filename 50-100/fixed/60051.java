@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_singleplayer);
    this.findViewById(R.id.singleplayer_back).setOnClickListener(this);
    this.initButtons();
    this.db = new teamfmg.hangman.DatabaseManager(this);
    this.label = ((android.widget.TextView) (findViewById(R.id.text_askedWord)));
    this.resetGame();
    this.changeBackground();
}