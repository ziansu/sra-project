public void setCurrentFile(com.alperez.bt_microphone.rest.response.commonmodels.DeviceFile devFile) {
    setCurrentTimeStart(devFile.startTime());
    setCurrentDuration(devFile.durationMillis());
    setCurrentPosition(devFile.currentPosition());
    setCurrentSampleRate(java.lang.Integer.toString(devFile.sampleRate()));
    setCurrentLocation(devFile.geoLocation());
}