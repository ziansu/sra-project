@java.lang.Override
protected void onRestoreInstanceState(android.os.Parcelable state) {
    if (state instanceof com.gh4a.widget.EditorBottomSheet.SavedState) {
        final com.gh4a.widget.EditorBottomSheet.SavedState ss = ((com.gh4a.widget.EditorBottomSheet.SavedState) (state));
        super.onRestoreInstanceState(ss.getSuperState());
        setAdvancedMode(ss.isInAdvancedMode);
        mBasicEditor.setText(ss.commentText);
        if ((mAdvancedEditor) != null) {
            mAdvancedEditor.setText(ss.commentText);
        }
    }else {
        super.onRestoreInstanceState(state);
    }
}