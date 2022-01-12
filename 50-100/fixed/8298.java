public void onGetLocationStatus(java.lang.Boolean status, java.lang.String message) {
    if (status) {
        org.mygeotrust.indoor.tasks.detectIndoorOutdoor.IndoorOutdoorDetectorController.getInstance().startIndoorOutdoorDetector(this, this);
        toggleIndoorOutdoorButtonStatus(true);
    }else {
        org.mygeotrust.indoor.utils.dialogue.Dialogs.getInstance().showInfoDialog(this, " Cannot start indoor/outdoor Detector.", (((" GPS use Status: " + status) + "\n Error: ") + message), R.drawable.ic_warning, R.color.colorRed);
        toggleIndoorOutdoorButtonStatus(false);
    }
}