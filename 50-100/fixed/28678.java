@java.lang.Override
protected void onMeasure(int widthSpec, int heightSpec) {
    super.onMeasure(widthSpec, heightSpec);
    if ((layoutType) == (br.com.jpttrindade.tagview.TagView.GRID)) {
        br.com.jpttrindade.tagview.TagView.mMaxSpan = ((int) ((getMeasuredWidth()) / (getResources().getDisplayMetrics().density)));
        if ((br.com.jpttrindade.tagview.TagView.mMaxSpan) == 0) {
            br.com.jpttrindade.tagview.TagView.mMaxSpan = 1;
        }
        ((android.support.v7.widget.GridLayoutManager) (getLayoutManager())).setSpanCount(br.com.jpttrindade.tagview.TagView.mMaxSpan);
    }
}