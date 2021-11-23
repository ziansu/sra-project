@java.lang.Override
public boolean shouldOverrideUrlLoading(fish.pondof.s.WebView view, fish.pondof.s.WebResourceRequest r) {
    fish.pondof.s.Uri uri = r.getUrl();
    if ((uri.getHost()) != (fish.pondof.s.Uri.parse(getString(R.string.main_url)).getHost())) {
        askJumpOut(uri);
        return false;
    }
    return true;
}