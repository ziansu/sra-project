public atu.testrecorder.ATUTestRecorder setVideoRecorder() {
    try {
        try {
            createDirectoryIfNotExists(objProp.getProperty("IAMONE.recording.dir"));
            recorder = new atu.testrecorder.ATUTestRecorder(objProp.getProperty("IAMONE.recording.dir"), objProp.getProperty("IAMONE.recording.fileName"), false);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    } catch (atu.testrecorder.exceptions.ATUTestRecorderException e) {
        e.printStackTrace();
    }
    return recorder;
}