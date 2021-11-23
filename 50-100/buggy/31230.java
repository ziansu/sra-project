@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.game_over_activity);
    android.os.Bundle extras = getIntent().getExtras();
    android.widget.TextView tv = ((android.widget.TextView) (findViewById(R.id.final_score_txt)));
    if (extras != null) {
        int v = extras.getInt("EXTRA_PLAYER_SCORE");
        if (v > 0) {
            GAME_SCORE = v;
        }else {
            GAME_SCORE = v;
        }
        tv.setText(("your final score is " + (GAME_SCORE)));
    }
}