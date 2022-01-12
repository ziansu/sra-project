@java.lang.Override
public void clickPosition(int position) {
    if ((playBinder) != null) {
        playBinder.onItemClickPosition(position);
        dl.closeDrawer(Gravity.LEFT, true);
    }
}