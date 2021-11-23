public void setDismissListener(com.jpeng.jptabbar.BadgeDismissListener listener) {
    for (com.jpeng.jptabbar.JPTabItem item : mJPTabItems) {
        item.setDismissDelegate(listener);
    }
}