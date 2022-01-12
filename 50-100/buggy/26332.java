@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_pdfviewer);
    pdfView = ((com.joanzapata.pdfview.PDFView) (findViewById(R.id.pdfview)));
    mProgressDialog = new android.app.ProgressDialog(this);
    mProgressDialog.setMessage("Loading");
    mProgressDialog.setIndeterminate(true);
    mProgressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
    java.lang.String pdfUrl = getIntent().getExtras().getString("PdfUrl");
    view(pdfUrl);
}