@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.net.Uri uri = getIntent().getData();
    final java.lang.String path = android.net.Uri.decode(uri.getEncodedPath());
    setContentView(R.layout.activity_doc_view);
    mDocActivityView = ((com.artifex.mupdf.android.DocActivityView) (findViewById(R.id.doc_view)));
    mDocActivityView.showUI(true);
    mDocActivityView.start(path);
}