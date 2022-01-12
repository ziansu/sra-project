@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.os.Bundle extras = getIntent().getExtras();
    chq = extras.getInt("currQ");
    questions = new java.lang.String[chq];
    questions = extras.getStringArray("questions");
    QuestionEngine();
}