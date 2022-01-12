public void buttonInsertPressed(android.view.View view) {
    android.content.ClipboardManager clipboardManager = ((android.content.ClipboardManager) (getSystemService(Context.CLIPBOARD_SERVICE)));
    if (clipboardManager.hasPrimaryClip()) {
        currentURL = clipboardManager.getPrimaryClip().getItemAt(0).getText().toString();
        java.lang.String currentID = com.linux13524.youtube_list_downloader.youtube.Helper.extractIDFromURL(currentURL);
        if (!("".equals(currentID)))
            editText_videoID.setText(currentID);
        
    }
}