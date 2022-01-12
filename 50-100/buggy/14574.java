public void submitTag() {
    final me.gujun.android.taggroup.TagGroup.TagView inputTag = getInputTag();
    if ((inputTag != null) && (inputTag.isInputAvailable())) {
        inputTag.endInput();
        if ((mOnTagChangeListener) != null) {
            mOnTagChangeListener.onAppend(this, inputTag.getText().toString());
        }
        appendInputTag();
    }
}