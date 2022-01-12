@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_topic_content);
    butterknife.ButterKnife.bind(this);
    setupToolbar();
    loadTopicName();
    setVocabularyListView();
    setDoExerciseButton();
}