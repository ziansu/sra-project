private void setPreferenceForRevenueItem(android.widget.CheckBox revenuSourceCheckbox, int revenueSourceId) {
    com.android.ssm.ssm.models.RevenueSource source = com.android.ssm.ssm.models.RevenueSource.findById(com.android.ssm.ssm.models.RevenueSource.class, revenueSourceId);
    if (source != null) {
        revenuSourceCheckbox.setChecked(true);
    }
}