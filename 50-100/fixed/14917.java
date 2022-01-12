@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_game);
    butterknife.ButterKnife.bind(this);
    mGuessButton.setOnClickListener(this);
    mPassButton.setOnClickListener(this);
    android.content.Intent intent = getIntent();
    java.util.ArrayList<java.lang.String> wordList = intent.getStringArrayListExtra("gameWordList");
    android.util.Log.v("wordList", (wordList + ""));
    countDownTimer.start();
}