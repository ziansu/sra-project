public void submitTag() {
    final me.gujun.android.taggroup.TagGroup.TagView inputTag = getInputTag();
    if ((inputTag != null) && (inputTag.isInputAvailable())) {
        if ((mOnTagChangeListener) != null) {
            if (mOnTagChangeListener.onAppend(this, inputTag.getText().toString())) {
                inputTag.endInput();
                appendInputTag();
            }
        }else {
            inputTag.endInput();
            appendInputTag();
        }
    }
}