private void setSettings() throws java.sql.SQLException {
    spAge.setSelection(ageAdapter.getPosition(kvr.getKeyValue("userAge").getString(0)));
    spProf.setSelection(ageAdapter.getPosition(kvr.getKeyValue("userProf").getString(0)));
}