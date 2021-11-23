@java.lang.Override
public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
    mWebView.setOnTouchListener(new android.view.View.OnTouchListener() {
        public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
            return (event.getAction()) == (android.view.MotionEvent.ACTION_MOVE);
        }
    });
    mWebView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
    loadContent(mMarkdown);
}