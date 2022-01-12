@java.lang.Override
public void onClick(android.view.View v) {
    if ((tab) == 1) {
        leftNav.setVisibility(View.INVISIBLE);
        rightNav.setVisibility(View.VISIBLE);
    }
    if ((tab) > 0) {
        (tab)--;
        vpPager.setCurrentItem(tab);
    }else
        if ((tab) == 0) {
            vpPager.setCurrentItem(tab);
        }
    
}