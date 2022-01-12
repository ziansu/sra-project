private void unsetDrawerItemSelected(android.widget.TextView item) {
    if (item != null) {
        item.setBackgroundColor(Color.TRANSPARENT);
        item.setTextColor(getResources().getColor(R.color.primary_dark_material_dark));
    }
}