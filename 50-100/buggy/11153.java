@java.lang.Override
public void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String key) {
    switch (key) {
        case com.feresr.rxweather.UI.SettingsActivity.PREF_UNIT :
            if (sharedPreferences.getString(key, "celsius").equals("celsius")) {
                citiesView.showTemperatureInCelsius();
            }else {
                citiesView.showTemperatureInFahrenheit();
            }
        case com.feresr.rxweather.UI.SettingsActivity.GRIDVIEW :
            if (sharedPreferences.getBoolean(key, false)) {
                citiesView.setSetColumns(2);
            }else {
                citiesView.setSetColumns(1);
            }
            break;
    }
}