@android.webkit.JavascriptInterface
public void launchPrevChapter() {
    android.util.Log.d("launchPrevChapter", " launchPrevChapter");
    if ((currentPage) > 1) {
        scrollToLast = true;
        makeRequest((--(currentPage)));
    }else
        if ((initialScale) <= 30) {
            android.widget.Toast toast = android.widget.Toast.makeText(getApplicationContext(), "First Page!", Toast.LENGTH_SHORT);
            toast.show();
        }
    
}