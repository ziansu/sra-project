public void onClickLanding(android.view.View view) {
    if (isFlying) {
        sendCommand(de.hhn.munz.ardrone2.ATCommand.land(), false);
        findViewById(R.id.btnLanding).setBackground(android.support.v4.content.ContextCompat.getDrawable(this, R.drawable.takeoff));
    }else {
        sendCommand(de.hhn.munz.ardrone2.ATCommand.takeOff(), false);
        findViewById(R.id.btnLanding).setBackground(android.support.v4.content.ContextCompat.getDrawable(this, R.drawable.land));
    }
    isFlying = !(isFlying);
}