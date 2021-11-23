@java.lang.Override
public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, android.support.v7.widget.RecyclerView parent, android.support.v7.widget.RecyclerView.State state) {
    if (shouldDrawDividerAbove(view, parent)) {
        outRect.top = mDividerHeight;
    }
    if (shouldDrawDividerBelow(view, parent)) {
        outRect.bottom = mDividerHeight;
    }
}