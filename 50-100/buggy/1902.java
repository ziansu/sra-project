@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_record);
    scrollView = ((android.widget.ScrollView) (findViewById(R.id.scrollView)));
    initNote();
    initModel();
    initToolbar();
    initVoice();
    initGallery();
}