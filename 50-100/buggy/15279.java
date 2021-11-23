public void handleMessage(android.os.Message msg) {
    super.handleMessage(msg);
    switch (msg.what) {
        case com.example.caprin.wexinrecorder.view.AudioRecorderButton.MSG_AUDIO_PREPARED :
            mDialogManager.showRecordingDialog();
            isRecording = true;
            new java.lang.Thread(mGetVoiceLevelRunnable).start();
            break;
        case com.example.caprin.wexinrecorder.view.AudioRecorderButton.MSG_VOICE_CHANGED :
            mDialogManager.updateVoiceLevel(mAudioManager.getVoiceLevel(7));
            break;
        case com.example.caprin.wexinrecorder.view.AudioRecorderButton.MSG_DIALOG_DIMISS :
            mDialogManager.disMissDialog();
            break;
    }
}