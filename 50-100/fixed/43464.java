@android.webkit.JavascriptInterface
public void launchNextChapter() {
    android.util.Log.d("launchNextChapter", " launchNextChapter");
    if ((currentPage) < (pageCount)) {
        scrollToLast = false;
        makeRequest((++(currentPage)));
    }else {
        toast = android.widget.Toast.makeText(getApplicationContext(), "Last Page!", Toast.LENGTH_SHORT);
        toast.show();
    }
}