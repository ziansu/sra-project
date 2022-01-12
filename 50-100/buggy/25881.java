@java.lang.Override
public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, android.support.v7.widget.RecyclerView parent, android.support.v7.widget.RecyclerView.State state) {
    int position = parent.getChildAdapterPosition(view);
    if (position < ((parent.getAdapter().getItemCount()) - (columns))) {
        if (position < (columns)) {
            outRect.top = 1 * (this.spacing);
        }else {
            outRect.top = (-2) * (this.spacing);
        }
        outRect.bottom = 0;
    }
}