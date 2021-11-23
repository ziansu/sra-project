@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_udacity_requirements);
    android.example.com.minimalquizapp.QuestionHolder.setContext(this);
    questions = android.example.com.minimalquizapp.QuestionHolder.getQuestions();
    if (savedInstanceState != null) {
        currentQuestionIndex = savedInstanceState.getInt(android.example.com.minimalquizapp.UdacityQuizRequirementsActivity.KEY_QUESTION_INDEX);
        playerScore = savedInstanceState.getInt(android.example.com.minimalquizapp.UdacityQuizRequirementsActivity.KEY_PLAYER_SCORE);
        currentQnA = questions.get(currentQuestionIndex);
    }
    if (savedInstanceState == null)
        switchQuizFragment();
    
}