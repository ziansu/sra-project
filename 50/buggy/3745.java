@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    startActivity(new android.content.Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS));
}