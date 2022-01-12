@java.lang.Override
public void onClick(android.view.View view) {
    android.util.Log.d("Log", "hier1");
    android.content.Intent intent = new android.content.Intent(getBaseContext(), de.androidnewcomer.pendlerwecker.Geo_Service.class);
    startService(intent);
}