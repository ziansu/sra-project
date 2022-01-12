private void clear() {
    billText.setText("");
    taxText.setText(sharedPrefs.getString("tax_preference", ""));
    setCurrencySymbol(sharedPrefs.getString("country_preference", ""));
    spinnerCountry.setSelection(getIndex(spinnerCountry, sharedPrefs.getString("country_preference", "")));
    setTip(java.lang.Integer.parseInt(sharedPrefs.getString("tip_preference", "")));
    clearFlag = true;
    splitBar.setProgress(0);
    roundDown.setChecked(false);
    roundUp.setChecked(false);
}