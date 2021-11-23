public void onClick(android.view.View button) {
    mIconId = (ib.isChecked()) ? com.sharad.epocket.AddCategoryActivity.UNASSIGNED : label;
    updateIconGroup(ib);
}