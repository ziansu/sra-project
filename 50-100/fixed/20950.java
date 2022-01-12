@java.lang.Override
public void onClick(android.view.View v) {
    if ((tabSelectedListener) != null) {
        tabSelectedListener.onTabSelected(position);
    }
    if ((pager.getCurrentItem()) != position) {
        markNotSelected(position);
        pager.setCurrentItem(position);
    }else
        if ((tabReselectedListener) != null) {
            tabReselectedListener.onTabReselected(position);
        }
    
}