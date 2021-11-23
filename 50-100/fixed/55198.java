@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Context context = getContext();
    com.google.android.gms.location.places.ui.PlacePicker.IntentBuilder builder = new com.google.android.gms.location.places.ui.PlacePicker.IntentBuilder();
    android.app.Activity settingsActivity = ((com.example.android.sunshine.app.SettingsActivity) (context));
    try {
        settingsActivity.startActivityForResult(builder.build(settingsActivity), SettingsActivity.PLACE_PICKER_REQUEST);
    } catch (com.google.android.gms.common.GooglePlayServicesNotAvailableException | com.google.android.gms.common.GooglePlayServicesRepairableException e) {
    }
}