@java.lang.Override
public void onInit(int status) {
    org.jraf.android.util.log.wrapper.Log.d(("status=" + status));
    mStatus = status;
    if ((mTextToSpeech) != null) {
        mTextToSpeech.addEarcon(mContext.getString(R.string.speak_activate_ride), mContext.getPackageName(), R.raw.start);
        mTextToSpeech.addEarcon(mContext.getString(R.string.speak_pause_ride), mContext.getPackageName(), R.raw.stop);
    }
}