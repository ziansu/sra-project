@java.lang.Override
public boolean onLongClick(android.view.View v) {
    if ((maximFeedListener) != null) {
        maximFeedListener.onLongClick(maxim);
    }
    return true;
}