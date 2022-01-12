public int updateStemRecordState(io.github.dstrekelj.pajamas.models.StemModel stem) {
    if (isRecordingStem(stem)) {
        stemRecorder.stop();
        stemRecorder = null;
        return io.github.dstrekelj.pajamas.recorder.RecordingSession.STEM_RECORDER_STOPPED;
    }else {
        if ((stemRecorder) == null) {
            stemRecorder = io.github.dstrekelj.pajamas.recorder.StemRecorderFactory.getStemRecorder(stem);
            return io.github.dstrekelj.pajamas.recorder.RecordingSession.STEM_RECORDER_ACTIVE;
        }
    }
    return io.github.dstrekelj.pajamas.recorder.RecordingSession.STEM_RECORDER_BUSY;
}