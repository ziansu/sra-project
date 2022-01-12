public void setCurrentFile(com.alperez.bt_microphone.rest.response.commonmodels.DeviceFile devFile) {
    setCurrentTimeStart(devFile.startTime());
    setCurrentDuration(java.lang.Long.toString(devFile.durationMillis()));
    setCurrentPosition(java.lang.Long.toString(devFile.currentPosition()));
    setCurrentSampleRate(java.lang.Integer.toString(devFile.sampleRate()));
    setCurrentLocation(devFile.geoLocation());
}