private void setSelectionDisplayPolicy(boolean displaySelection) {
    if (displaySelection != (mAllowSelectionChangesP)) {
        mAllowSelectionChangesP = displaySelection;
        if (!displaySelection) {
            getEditableText().removeSpan(mSelectionForegroundSpan);
            getEditableText().removeSpan(mSelectionBackgroundSpan);
            mCurrentSelection = null;
        }else {
            if ((mParseNode) != null) {
                mCurrentSelection = mParseNode.findNode(mCursorPosition);
                renderSelection(false);
            }
        }
    }
    mAllowSelectionChangesP = displaySelection;
}