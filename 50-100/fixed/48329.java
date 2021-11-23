@java.lang.Override
public void onClick(android.view.View view) {
    if ((mTopicScrollView.getVisibility()) == (android.view.View.VISIBLE)) {
        mTopicScrollView.setVisibility(View.GONE);
        mContentEditText.setEnabled(true);
    }else {
        mTopicScrollView.setVisibility(View.VISIBLE);
        mContentEditText.setEnabled(false);
    }
}