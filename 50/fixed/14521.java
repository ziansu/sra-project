@java.lang.Override
public void onSuccess(java.lang.String url) {
    currentFrame = setUrl(url);
    setHeadingHtml(url);
    unmask();
    if ((restoreButton) != null) {
        restoreButton.setEnabled(true);
    }
}