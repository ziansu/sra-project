@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_approach);
    butterknife.ButterKnife.inject(this);
    com.shinav.mathapp.question.Question question = com.shinav.mathapp.progress.ProgressProvider.getCurrentQuestion();
    approaches = new java.util.ArrayList(question.getApproaches());
    questionTitle.setText(question.getTitle());
    questionText.setText(question.getValue());
    initApproachList();
}