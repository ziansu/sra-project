private void menuMainClearClick() {
    for (int i = (mTagContent.getChildCount()) - 1; i >= 0; i--) {
        se.anyro.nfc_reader.View view = mTagContent.getChildAt(i);
        if ((view.getId()) != (R.id.tag_viewer_text)) {
            mTagContent.removeViewAt(i);
        }
    }
}