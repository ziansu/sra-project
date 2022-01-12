@java.lang.Override
public boolean shouldOverrideUrlLoading(fish.pondof.s.WebView view, java.lang.String url) {
    if (!(url.startsWith(getString(R.string.main_url)))) {
        askJumpOut(fish.pondof.s.Uri.parse(url));
        return true;
    }
    return false;
}