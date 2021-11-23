public void onClickTakeOff(android.view.View view) {
    sendCommand(de.hhn.munz.ardrone2.ATCommand.takeOff());
    networkLoop();
}