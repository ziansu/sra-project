@java.lang.Override
protected void toggleState() {
    (mRingerValuesIndex)++;
    if ((mRingerValuesIndex) > ((mRingerValues.length) - 1)) {
        mRingerValuesIndex = 0;
    }
    mRingersIndex = mRingerValues[mRingerValuesIndex];
    com.android.systemui.statusbar.powerwidget.SoundButton.Ringer ringer = mRingers[mRingersIndex];
    ringer.execute();
}