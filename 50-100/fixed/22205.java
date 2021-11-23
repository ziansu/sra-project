@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_about);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    setupText();
    mImageAbout.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            circularRevealAboutImage();
        }
    });
}