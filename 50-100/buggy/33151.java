private void setSelectionDisplayPolicy(boolean displaySelection) {
    if (displaySelection != (mAllowSelectionChangesP)) {
        mAllowSelectionChangesP = displaySelection;
        if (!displaySelection) {
            getEditableText().removeSpan(mSelectionForegroundSpan);
            getEditableText().removeSpan(mSelectionBackgroundSpan);
            mCurrentSelection = null;
        }else {
            mCurrentSelection = mParseNode.findNode(mCursorPosition);
            renderSelection(false);
        }
    }
    mAllowSelectionChangesP = displaySelection;
}