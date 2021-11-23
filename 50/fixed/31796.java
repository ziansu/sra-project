@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent settingIntent = new android.content.Intent(this, com.example.yink.amadeus.SettingsActivity.class);
    startActivity(settingIntent);
}