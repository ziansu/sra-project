@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    textViewScore = ((android.widget.TextView) (findViewById(R.id.text_view_score)));
    textViewBest = ((android.widget.TextView) (findViewById(R.id.text_view_best)));
    android.content.SharedPreferences sp = getSharedPreferences("game2048", Context.MODE_PRIVATE);
    bestScore = sp.getInt("best", 0);
    textViewScore.setText(((bestScore) + ""));
    com.mookrs.game2048.MainActivity.mainActivity = this;
}