public void setVisible(boolean v) {
    if ((app.has(Feature.CLOSE_LABEL_DIALOG_AT_ESC)) && (isVisible())) {
        closeLabelPopup();
    }
    super.setVisible(v);
}