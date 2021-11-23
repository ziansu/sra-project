@java.lang.Override
protected void toggleState() {
    (mRingerValuesIndex)++;
    if ((mRingerValuesIndex) > ((mRingerValues.length) - 1)) {
        mRingerValuesIndex = 0;
    }
    mRingersIndex = mRingerValues[mRingerValuesIndex];
    if ((mRingersIndex) > ((mRingers.length) - 1)) {
        mRingersIndex = 0;
    }
    com.android.systemui.statusbar.powerwidget.SoundButton.Ringer ringer = mRingers[mRingersIndex];
    ringer.execute();
}