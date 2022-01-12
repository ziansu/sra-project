@java.lang.Override
public void onScroll(android.widget.AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
    int topRowVerticalPosition = (((messageList) == null) || ((messageList.getChildCount()) == 0)) ? 0 : messageList.getChildAt(0).getTop();
    swipeLayout.setEnabled(((topRowVerticalPosition >= 0) && (firstVisibleItem == 0)));
}