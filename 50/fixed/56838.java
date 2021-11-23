@java.lang.Override
public void call(com.i906.mpt.prayer.PrayerContext prayer) {
    mIsError.set(false);
    mPrayerStream.onNext(prayer);
}