@java.lang.Override
public void onWrongPassword() {
    navigationView.getMenu().getItem(0).getSubMenu().getItem(selectedItem).setChecked(false);
    navigationView.getMenu().getItem(0).getSubMenu().getItem(lastSelectedItem).setChecked(false);
}