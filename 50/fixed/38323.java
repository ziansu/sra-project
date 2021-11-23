@java.lang.Override
public void onRecordingSaved() {
    if (((mAudio) == null) || (!(mAudio.isRecording()))) {
        stopForeground(true);
    }
}