private void changeState(int state) {
    if ((mCurState) != state) {
        mCurState = state;
        switch (state) {
            case com.hm.madroid.mood.view.AudioRecorderButton.STATE_NORMAL :
                setBackgroundResource(R.drawable.btn_recoder_normal);
                setText(R.string.str_recoder_normal);
                mDialogManager.showRecordingDialog();
                break;
            case com.hm.madroid.mood.view.AudioRecorderButton.STATE_RECORDING :
                setBackgroundResource(R.drawable.btn_recoding);
                setText(R.string.str_recoder_recoding);
                mDialogManager.recoding();
                break;
            case com.hm.madroid.mood.view.AudioRecorderButton.STATE_WANT_TO_CANCEL :
                setBackgroundResource(R.drawable.btn_recoding);
                setText(R.string.str_recoder_want_cancel);
                mDialogManager.wantToCancel();
                break;
            default :
                break;
        }
    }
}