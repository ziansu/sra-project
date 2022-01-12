public static ee.ioc.phon.android.speechutils.ContinuousRawAudioRecorder.SessionStartPointer someSecondsBack(int secondsBackToStartTheSessionFrom) {
    return new ee.ioc.phon.android.speechutils.ContinuousRawAudioRecorder.SessionStartPointer((-(java.lang.Math.abs((secondsBackToStartTheSessionFrom * 1000)))));
}