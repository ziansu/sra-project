@java.lang.Override
public void onItemClicked(int mPosition, com.gnest.remember.data.SelectableMemo mMemo, android.widget.TextView mTextView) {
    if (isMultiChoiceEnabled()) {
        updateSelectedList(mPosition, mMemo);
        if ((mSelectedList.size()) < 2) {
            mListener.setShareButtonVisibility(true);
        }else {
            mListener.setShareButtonVisibility(false);
        }
    }else {
        mListener.onSingleChoiceMemoClicked(mMemo, mTextView);
    }
}