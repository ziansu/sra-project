@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    setContentView(R.layout.game_over_activity);
    android.os.Bundle extras = getIntent().getExtras();
    android.widget.TextView tv = ((android.widget.TextView) (findViewById(R.id.final_score_txt)));
    if (extras != null) {
        int v = extras.getInt("EXTRA_PLAYER_SCORE");
        tv.setText(("your final score is " + v));
    }
    super.onCreate(savedInstanceState);
}