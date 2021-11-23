@java.lang.Override
public void onBandContactChanged(final com.microsoft.band.sensors.BandContactEvent bandContactEvent) {
    switch (bandContactEvent.getContactState()) {
        case WORN :
            android.util.Log.d("CheckBandOnActivity", "The band is on!");
            try {
                client.disconnect().await();
            } catch (java.lang.Exception ex) {
                android.util.Log.d("CheckBandOnActivity", "disconnecting from Band", ex);
            }
            startActivity(new android.content.Intent(this, lab.star.surf_iot2015.SensorDataConsole.class));
            break;
        case NOT_WORN :
            break;
    }
}