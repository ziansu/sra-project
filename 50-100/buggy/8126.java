private void getInitialData() {
    com.home.pete.aquarium.MessagePayload msg = new com.home.pete.aquarium.MessagePayload();
    msg.getHeaterState();
    msg.getPumpState();
    msg.getTemps();
    msg.getWaterLevel();
    msg.makeFinal();
    com.home.pete.aquarium.Intent i = new com.home.pete.aquarium.Intent("settings-event");
    i.putExtra("ACTION", msg.getMessage());
    android.support.v4.content.LocalBroadcastManager.getInstance(this).sendBroadcast(i);
}