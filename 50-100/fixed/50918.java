@java.lang.Override
public void onClick(com.std.framework.comm.view.MainBottomView.TabSpec tabSpec) {
    if ((last_selected_index) == (tabSpec.getIndex())) {
        return ;
    }
    tabSpec.setSelected(true);
    tabs.get(last_selected_index).setSelected(false);
    last_selected_index = tabSpec.getIndex();
    if ((viewPager) != null) {
        viewPager.setCurrentItem(tabSpec.getIndex(), false);
    }
}