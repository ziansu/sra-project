private void init(android.content.Context context, android.util.AttributeSet attrs) {
    header = new com.nsnv.mlib.RefreshHeader(context);
    com.nsnv.mlib.LayoutParams lp = new android.widget.LinearLayout.LayoutParams(context, attrs);
    lp.gravity = android.view.Gravity.CENTER;
    HEIGHT_HEADER_FOOTER = context.getResources().getDimensionPixelSize(R.dimen.refresh_header_footer_size);
    lp.topMargin = -(HEIGHT_HEADER_FOOTER);
    addView(header, lp);
    footer = new com.nsnv.mlib.RefreshFooter(context);
    mScroller = new android.widget.Scroller(context);
}