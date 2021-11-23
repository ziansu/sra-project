@java.lang.Override
public void onClick(android.view.View view) {
    prefs.edit().putLong(eu.faircode.backpacktrack2.SettingsFragment.PREF_LAST_WEATHER_VIEWPORT, (7 * (eu.faircode.backpacktrack2.SettingsFragment.DAY_MS))).apply();
    showWeatherGraph(graph);
}