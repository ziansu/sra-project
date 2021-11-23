@java.lang.Override
public void onInput(com.afollestad.materialdialogs.MaterialDialog dialog, java.lang.CharSequence input) {
    save(webView.getTitle(), webView.getUrl());
    dialog.dismiss();
}