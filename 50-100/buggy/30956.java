@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_game);
    logic = new com.example.mikkel.hangman.Logic();
    gameText = ((android.widget.TextView) (findViewById(R.id.word)));
    gameText.setText(logic.getSynligtOrd());
    image = ((android.widget.ImageView) (findViewById(R.id.galge)));
    initButtons();
    something = "Guess the word: " + (logic.getSynligtOrd());
}