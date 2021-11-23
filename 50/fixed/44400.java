@java.lang.Override
public void onClick(android.view.View v) {
    int current = getItem((+1));
    if (current < (layouts.length)) {
        viewPager.setCurrentItem(current);
    }
}