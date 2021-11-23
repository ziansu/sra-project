@java.lang.Override
public void onClick(android.view.View view) {
    switch (view.getId()) {
        case R.id.video :
            {
                this.mButtonVideo.setEnabled(false);
                java.lang.String message;
                if (mIsRecordingVideo) {
                    message = gcm.play.android.samples.com.gcmquickstart.MainFragment.STOP_RECORDING_MESSAGE;
                }else {
                    message = gcm.play.android.samples.com.gcmquickstart.MainFragment.START_RECORDING_MESSAGE;
                }
                new gcm.play.android.samples.com.gcmquickstart.SendMessageTask(this.getContext()).execute(message, java.lang.Integer.toString(fileMaker.getNextId()));
                break;
            }
    }
}