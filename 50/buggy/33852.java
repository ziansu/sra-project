@java.lang.Override
public void onClick(android.view.View v) {
    int current = getItem((-1));
    if (current > 0) {
        viewPager.setCurrentItem(current);
    }
}