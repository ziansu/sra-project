@java.lang.Override
public void onClick(android.view.View v) {
    tab = vpPager.getCurrentItem();
    if ((tab) == 0) {
        leftNav.setVisibility(View.VISIBLE);
        rightNav.setVisibility(View.INVISIBLE);
    }
    (tab)++;
    vpPager.setCurrentItem(tab);
}