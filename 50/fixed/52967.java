@java.lang.Override
public void onClick(android.view.View v) {
    if ((mDeleteListener) != null) {
        mDeleteListener.onTagDeleted(this, tag, position);
    }
}