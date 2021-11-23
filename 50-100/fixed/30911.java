public void setRowChecked(java.lang.String property, boolean checked) {
    for (int i = 0; i < (rowsArray.size()); i++) {
        com.kaliturin.blacklist.adapters.SettingsArrayAdapter.ViewHolder viewHolder = rowsArray.valueAt(i);
        if (((viewHolder.model.property) != null) && (viewHolder.model.property.equals(property))) {
            viewHolder.setChecked(checked);
            break;
        }
    }
}