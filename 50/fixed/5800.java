protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    initDB();
    getLocalHighscore();
    setupUI();
    getScoreList();
}