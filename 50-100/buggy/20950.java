@java.lang.Override
public void onClick(android.view.View v) {
    if ((tabSelectedListener) != null) {
        tabSelectedListener.onTabSelected(position);
    }
    if ((pager.getCurrentItem()) != position) {
        android.view.View tab = tabsContainer.getChildAt(pager.getCurrentItem());
        markNotSelected(position);
        pager.setCurrentItem(position);
    }else
        if ((tabReselectedListener) != null) {
            tabReselectedListener.onTabReselected(position);
        }
    
}