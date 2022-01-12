@java.lang.Override
public void run() {
    if (isOpened())
        return ;
    
    fab.show(animate);
    com.github.clans.fab.Label label = ((com.github.clans.fab.Label) (fab.getTag(R.id.fab_label)));
    if ((label != null) && (label.isHandleVisibilityChanges())) {
        label.show(animate);
    }
    if (count == 0) {
        mMenuOpened = true;
    }
}