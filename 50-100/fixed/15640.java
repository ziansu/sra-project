@java.lang.Override
public void onPictureSaved(final android.net.Uri uri) {
    android.util.Log.d("app", ("Saved: " + (uri.toString())));
    savedGreenImageUri = uri;
    setShareActionProvider(uri);
    android.support.design.widget.Snackbar.make(rootLayout, "Ready to SHARE!", Snackbar.LENGTH_LONG).setAction("Share", new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            shareGreenPhoto("GreenUniversity", "#GreenUniversity", savedGreenImageUri);
        }
    }).show();
}