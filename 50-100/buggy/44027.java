public void setDefaultCity(android.view.View view) {
    android.content.SharedPreferences.Editor prefEditor = _settings.edit();
    if (this._defaultCityCheckbox.isChecked()) {
        prefEditor.putString("DEFAULT", this._location.toUpperCase());
        prefEditor.commit();
    }else {
        prefEditor.remove("DEFAULT");
    }
}