private void setupExpenditurePreferences(com.android.ssm.ssm.models.SsmUser currentUser) {
    android.widget.CheckBox c;
    if (currentUser != null)
        for (int i = 0; i < (expenditures.length); i++) {
            c = expenditures[i];
            com.android.ssm.ssm.models.ExpenditureSource source = com.android.ssm.ssm.models.ExpenditureSource.findById(com.android.ssm.ssm.models.ExpenditureSource.class, (i + 1));
            if (source != null) {
                c.setChecked(true);
            }
        }
    
}