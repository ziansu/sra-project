@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_game);
    this.GUI = java.lang.Thread.currentThread();
    this.BQTask = null;
    this.DQTask = null;
    this.highscore = 0;
    this.life = 7;
    initAnswerButtons();
    initLife();
    readQuestions();
    startAsyncMain();
}