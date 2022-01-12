@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem item) {
    changeTicks(timeBar, 1);
    if (timeBar2 != null) {
        changeTicks(timeBar2, 1);
    }
    item15.setEnabled(true);
    item5.setEnabled(true);
    item1.setEnabled(false);
    return true;
}