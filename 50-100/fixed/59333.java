@java.lang.Override
public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, android.support.v7.widget.RecyclerView parent, android.support.v7.widget.RecyclerView.State state) {
    super.getItemOffsets(outRect, view, parent, state);
    if ((mOrientation) == (com.lsj.hdmi.materialtest.MyDecoration.Vertical_list)) {
        outRect.set(0, 0, 0, mDivider.getIntrinsicHeight());
    }else
        if ((mOrientation) == (com.lsj.hdmi.materialtest.MyDecoration.Horizontal_list)) {
            outRect.set(mDivider.getIntrinsicHeight(), 0, 0, 0);
        }
    
}