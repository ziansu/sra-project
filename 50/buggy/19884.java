private com.oney.WebRTCModule.VideoCapturer getVideoCapturerById(int id) {
    java.lang.String name = com.oney.WebRTCModule.CameraEnumerationAndroid.getDeviceName(id);
    if (name == null) {
        name = com.oney.WebRTCModule.CameraEnumerationAndroid.getNameOfFrontFacingDevice();
    }
    return com.oney.WebRTCModule.VideoCapturerAndroid.create(name);
}