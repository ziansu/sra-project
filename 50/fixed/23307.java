@java.lang.Override
public void execute(android.os.Bundle bundle) {
    loadingMore = true;
    if ((skipMessages) != 0) {
        messagesListView.setSelection(0);
    }
    hideActionBarProgress();
}