private void initViews() {
    int startOffset = getResources().getDimensionPixelSize(R.dimen.subject_list_refresh_start_offset);
    int endOffset = getResources().getDimensionPixelSize(R.dimen.subject_list_refresh_end_offset);
    pageMainSrl.setProgressViewOffset(false, startOffset, endOffset);
    pageMainLv.setOnScrollListener(new com.londonx.lutil.impl.NextPageLoader(pageMainLv, this, android.support.v4.content.ContextCompat.getColor(getContext(), R.color.colorAccent)));
}