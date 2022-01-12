@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
    com.dss886.emotioninputdetector.library.EmotionInputDetector.with(this).setEmotionView(R.id.emotion_layout).bindToEditText(R.id.edit_text).bindToEmotionButton(R.id.emotion_button).build();
    setUpEmotionViewPager();
}