@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem item) {
    changeTicks(timeBar, 5);
    if (timeBar2 != null) {
        changeTicks(timeBar2, 5);
    }
    item15.setEnabled(true);
    item5.setEnabled(false);
    item1.setEnabled(true);
    return true;
}