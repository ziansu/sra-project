private void removeRecordingModules() {
    java.util.List<module.Module> recordingModules = new java.util.ArrayList<>();
    for (module.Module module : mModules) {
        if ((module instanceof record.wave.RealBufferWaveRecorder) || (module instanceof record.wave.ComplexBufferWaveRecorder)) {
            recordingModules.add(module);
        }
    }
    for (module.Module recordingModule : recordingModules) {
        removeModule(recordingModule);
    }
}