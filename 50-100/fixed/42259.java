private static void cacheFavicon(@android.support.annotation.Nullable
final java.lang.String url, @android.support.annotation.Nullable
final android.graphics.Bitmap icon, @android.support.annotation.NonNull
final android.content.Context context) {
    if ((icon == null) || (url == null))
        return ;
    
    final android.net.Uri uri = android.net.Uri.parse(url);
    if ((uri.getHost()) == null) {
        return ;
    }
    acr.browser.lightning.app.BrowserApp.getIOThread().execute(new acr.browser.lightning.view.IconCacheTask(uri, icon, acr.browser.lightning.app.BrowserApp.get(context)));
}