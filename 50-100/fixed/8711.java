@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if (intent == null) {
        return ;
    }
    android.net.Uri uri = intent.getParcelableExtra("uri");
    com.lzh.nonview.router.extras.RouteBundleExtras extras = intent.getParcelableExtra("extras");
    com.lzh.nonview.router.Router.resume(uri, extras).open(context);
}