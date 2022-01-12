@java.lang.Override
public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, android.support.v7.widget.RecyclerView parent, android.support.v7.widget.RecyclerView.State state) {
    int position = parent.getChildAdapterPosition(view);
    if (position >= (columns)) {
        outRect.top = padding;
    }
    if ((position % (columns)) != 0) {
        outRect.left = padding;
    }
}