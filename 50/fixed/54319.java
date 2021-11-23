@java.lang.Override
public void onChildViewRemoved(android.view.View parent, android.view.View child) {
    super.onChildViewRemoved(parent, child);
    updateChildIndices();
}