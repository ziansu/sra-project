@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem item) {
    changeTicks(timeBar, 15);
    if (timeBar2 != null) {
        changeTicks(timeBar2, 15);
    }
    item15.setEnabled(false);
    item5.setEnabled(true);
    item1.setEnabled(true);
    return true;
}