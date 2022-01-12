@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    new com.myhitchhikingspots.SettingsActivity.getCountriesAsyncTask(true).execute();
}