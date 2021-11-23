@java.lang.Override
public void onScrollStateChanged(android.widget.AbsListView view, int scrollState) {
    if (scrollState == 0)
        return ;
    
    final int currentFirstVisibleItem = view.getFirstVisiblePosition();
    if (currentFirstVisibleItem > (lastItemVisible)) {
        fab.hide();
    }else
        if (currentFirstVisibleItem < (lastItemVisible)) {
            fab.show();
        }
    
    lastItemVisible = currentFirstVisibleItem;
}