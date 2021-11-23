@java.lang.Override
public int getViewVerticalDragRange(android.view.View child) {
    return ((dragEdge) == (com.liuguangqiang.swipeback.SwipeBackLayout.DragEdge.TOP)) || ((dragEdge) == (com.liuguangqiang.swipeback.SwipeBackLayout.DragEdge.BOTTOM)) ? (android.support.v4.widget.ViewDragHelper.EDGE_TOP) | (android.support.v4.widget.ViewDragHelper.EDGE_BOTTOM) : 0;
}