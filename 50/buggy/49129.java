public void setEnabled() {
    if ((org.csploit.android.core.ChildManager.handlers) != null) {
        mEnabled = ChildManager.handlers.contains(mHandler);
    }
}