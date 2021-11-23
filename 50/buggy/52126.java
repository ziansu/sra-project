@java.lang.Override
public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, android.support.v7.widget.RecyclerView parent, android.support.v7.widget.RecyclerView.State state) {
    outRect.bottom = mSpaceHeight;
    outRect.top = mSpaceHeight;
    outRect.left = mSpaceHeight;
    outRect.right = mSpaceHeight;
}