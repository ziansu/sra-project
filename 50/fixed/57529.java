@java.lang.Override
public void onClick(android.view.View v) {
    if (!(performingLoad))
        mWebView.searchByUrl();
    
}