private void setSettings() throws java.sql.SQLException {
    spAge.setSelection(ageAdapter.getPosition(kvr.getKeyValue("userAge").getString(1)));
    spProf.setSelection(ageAdapter.getPosition(kvr.getKeyValue("userProf").getString(1)));
}