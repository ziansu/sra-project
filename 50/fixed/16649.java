public void setCaption(java.lang.String caption) {
    inflate();
    mCaption.setText(sanitizeText(caption));
    invalidate();
    show();
}