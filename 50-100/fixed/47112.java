@java.lang.Override
public void onResume() {
    super.onResume();
    android.content.SharedPreferences settings = android.preference.PreferenceManager.getDefaultSharedPreferences(getContext());
    com.google.gson.Gson gson = new com.google.gson.Gson();
    schedules = gson.fromJson(settings.getString("rotationState", ""), com.mattrubacky.monet2.Schedules.class);
    monthlyGear = gson.fromJson(settings.getString("reward_gear", ""), com.mattrubacky.monet2.Gear.class);
    wearLink.openConnection();
}