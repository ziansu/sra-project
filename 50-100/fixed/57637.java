@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_round_form);
    if ((game = ((kei.mobilehero.classes.general.Game) (getIntent().getExtras().get("game")))) == null) {
        android.util.Log.v("NewRound onCreate()", "Couldn't get the game.");
        finish();
    }
}