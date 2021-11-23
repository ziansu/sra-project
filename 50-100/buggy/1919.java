@java.lang.Override
public int getLastVisiblePosition() {
    int position = mListView.getLastVisiblePosition();
    int count = ((mListView.getCount()) - (mListView.getHeaderViewsCount())) - (mListView.getFooterViewsCount());
    if ((position > (count - 1)) && (count > 0))
        position = count - 1;
    
    return position;
}