public void readRecording(java.lang.String recordedVariable, org.geppetto.model.ExperimentState modelState, boolean readAll) throws org.geppetto.core.common.GeppettoExecutionException {
    openRecording();
    java.lang.String recordingVariablePath = "/" + recordedVariable;
    recordingVariablePath = recordingVariablePath.replace(".", "/");
    this.readVariable(recordingVariablePath, recording.getHDF5(), modelState, readAll);
    if (!readAll) {
        (currentRecordingIndex)++;
    }
    closeRecording();
}