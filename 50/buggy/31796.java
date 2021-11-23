@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent settingIntent = new android.content.Intent(getApplicationContext(), com.example.yink.amadeus.SettingsActivity.class);
    startActivity(settingIntent);
}