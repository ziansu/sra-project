public void changeState(com.mingke.newmoduo.view.widget.record.RecordButton.State newState) {
    if ((currentState) == newState) {
        return ;
    }
    currentState = newState;
    switch (newState) {
        case STATE_NORMAL :
            setText(R.string.str_record_normal);
            setBackgroundResource(R.drawable.btn_record_normal);
            mAudioDialogManager.dismiss();
            break;
        case STATE_RECORDING :
            setText(R.string.str_record_recording);
            mAudioDialogManager.showRecordingDialog();
            setBackgroundResource(R.drawable.btn_record_recording);
            break;
        case STATE_WANT_CANCEL :
            setText(R.string.str_record_want_cancel);
            setBackgroundResource(R.drawable.btn_record_recording);
            mAudioDialogManager.showWantCancelDialog();
            break;
    }
}