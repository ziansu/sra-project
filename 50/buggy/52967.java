@java.lang.Override
public void onClick(android.view.View v) {
    if ((mDeleteListener) != null) {
        com.cunoraz.tagview.Tag targetTag = tag;
        mDeleteListener.onTagDeleted(this, targetTag, position);
    }
}