@java.lang.Override
protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    android.util.Log.d("Search Layout", "Handling Keyboard Window shown");
    final int proposedheight = ch.unibe.scg.zeeguu.Search_Fragments.MeasureSpec.getSize(heightMeasureSpec);
    final int actualHeight = getHeight();
    if (actualHeight > proposedheight) {
        findViewById(R.id.relativeLayout_text_translated).setVisibility(ch.unibe.scg.zeeguu.Search_Fragments.GONE);
    }else {
        findViewById(R.id.relativeLayout_text_translated).setVisibility(ch.unibe.scg.zeeguu.Search_Fragments.VISIBLE);
    }
    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
}