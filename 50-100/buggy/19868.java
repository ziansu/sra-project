private void setSettings() throws java.sql.SQLException {
    if ((kvr.getKeyValue("userGender").getString(0)) != "Gender")
        spGender.setSelection(genderAdapter.getPosition(kvr.getKeyValue("userGender").getString(0)));
    
    etName.setText(kvr.getKeyValue("userName").getString(0));
}