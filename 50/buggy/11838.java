@java.lang.Override
public void run() {
    notifyDataSetChanged();
    if ((listView) != null)
        updateUnreadIndicators(listView.getFirstVisiblePosition(), listView.getLastVisiblePosition());
    
}