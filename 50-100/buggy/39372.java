@java.lang.Override
public void run() {
    if ((mLeadInCounter) < (mLeadInText.length)) {
        if (org.roundware.rwapp.RwSpeakActivity.D) {
            android.util.Log.d(org.roundware.rwapp.RwSpeakActivity.TAG, (("displaying lead in text '" + (mLeadInText[((mLeadInCounter) - 1)])) + "'"));
        }
        mRecordingTimeText.setText(mLeadInText[((mLeadInCounter) - 1)]);
    }
}