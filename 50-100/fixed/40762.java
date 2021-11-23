@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    if (isFirstRun()) {
        startActivity(new android.content.Intent(this, edu.umkc.eradford.ctrl_f.FirstRun.class));
    }
    unwrap(savedInstanceState);
    setupGUI();
    fileUri = android.net.Uri.fromFile(new java.io.File(getApplicationContext().getExternalFilesDir(Environment.DIRECTORY_PICTURES), "document.jpg"));
    ocr = new com.googlecode.tesseract.android.TessBaseAPI();
    trainOCR();
}