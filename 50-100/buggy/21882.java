void startRecording(dreamrec.RecordingSettings recordingSettings, java.io.File file) throws dreamrec.ApplicationException {
    if ((recordingSettings.getDirectoryToSave()) != (file.getParent())) {
        guiConfig.setDirectoryToSave(recordingSettings.getDirectoryToSave());
        eventHandler.startRecording(recordingSettings, file);
    }
}