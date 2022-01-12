@java.lang.Override
public void reviewProcessFinish(java.lang.String[] output) {
    java.util.List<java.lang.String> list = new java.util.ArrayList<>(java.util.Arrays.asList(output));
    if (!(list.isEmpty())) {
        reviewHeaderView.setText("Reviews");
        mReviewAdapter = new android.widget.ArrayAdapter<java.lang.String>(getContext(), R.layout.review_text_view, R.id.review_textview, list);
        reviewListView.setAdapter(mReviewAdapter);
    }
}