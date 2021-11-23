@java.lang.Override
public void run() {
    if ((listView) != null)
        updateUnreadIndicators(listView.getFirstVisiblePosition(), listView.getLastVisiblePosition());
    
}