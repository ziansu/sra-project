public void onSaveSetting(android.view.View view) {
    android.widget.Spinner spinner = ((android.widget.Spinner) (this.findViewById(R.id.countryDropDown)));
    com.freedom.freeclient.freeclient.Country country = ((com.freedom.freeclient.freeclient.Country) (spinner.getSelectedItem()));
    java.lang.StringBuilder buf = new java.lang.StringBuilder();
    final java.util.Properties props = com.freedom.freeclient.freeclient.util.Util.getProperties(com.freedom.freeclient.freeclient.util.Config.getInfoFilePath());
    props.put("country", country.getId());
    new com.freedom.freeclient.freeclient.SettingsActivity.SaveAsync(props).execute();
}