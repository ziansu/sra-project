@java.lang.Override
public void onWrongPassword() {
    if ((selectedItem) >= 0)
        navigationView.getMenu().getItem(0).getSubMenu().getItem(selectedItem).setChecked(false);
    
    if ((lastSelectedItem) >= 0)
        navigationView.getMenu().getItem(0).getSubMenu().getItem(lastSelectedItem).setChecked(false);
    
    selectedItem = -1;
    lastSelectedItem = -1;
}