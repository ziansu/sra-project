@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mSingleDocumentAnalyzer = ((net.gini.android.vision.screen.ScreenApiApp) (getApplication())).getSingleDocumentAnalyzer();
}