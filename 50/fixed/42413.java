@java.lang.Override
public void run() {
    int messageCount = mMessages.size();
    if (messageCount > 0) {
        mMessages.clear();
        fireTableRowsDeleted(0, (messageCount - 1));
    }
}