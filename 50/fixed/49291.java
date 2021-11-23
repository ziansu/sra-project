@java.lang.Override
public void onInput(com.afollestad.materialdialogs.MaterialDialog dialog, java.lang.CharSequence input) {
    save(input.toString(), webView.getUrl());
    dialog.dismiss();
}