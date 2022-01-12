int getSessionStartPointerMillis() {
    if (((this) == (ee.ioc.phon.android.speechutils.ContinuousRawAudioRecorder.SessionStartPointer.mBeginningOfBufferPosition)) && ((mSessionStartPointerMillis) == (java.lang.Integer.MIN_VALUE)))
        return ee.ioc.phon.android.speechutils.ContinuousRawAudioRecorder.SessionStartPointer.mNowPosition.getSessionStartPointerMillis();
    
    if (((this) != (ee.ioc.phon.android.speechutils.ContinuousRawAudioRecorder.SessionStartPointer.mBeginningOfBufferPosition)) && ((mSessionStartPointerMillis) > (ee.ioc.phon.android.speechutils.ContinuousRawAudioRecorder.SessionStartPointer.mBeginningOfBufferPosition.getSessionStartPointerMillis())))
        return ee.ioc.phon.android.speechutils.ContinuousRawAudioRecorder.SessionStartPointer.mBeginningOfBufferPosition.getSessionStartPointerMillis();
    
    return mSessionStartPointerMillis;
}