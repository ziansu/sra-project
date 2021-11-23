@java.lang.Override
public void onConnected(android.os.Bundle connectionHint) {
    android.util.Log.d(io.internetthings.sailfish.GoogleAuth2Activity.logTAG, "Successfully connected to Google");
    restartService();
    boolean ftueCompleted = io.internetthings.sailfish.SailfishPreferences.reader(this).getBoolean(SailfishPreferences.FTUE_COMPLETED_KEY, false);
    android.content.Intent i;
    if (!ftueCompleted) {
        i = new android.content.Intent(this, io.internetthings.sailfish.ftue.NotificationAccessActivity.class);
    }else {
        i = new android.content.Intent(this, io.internetthings.sailfish.OptionsActivity.class);
    }
    startActivity(i);
    this.finish();
}