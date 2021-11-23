@java.lang.Override
public void accept(java.util.List<prada.lab.android.pingo.model.PingoPlace> pingoPlaces) throws java.lang.Exception {
    mLastUpdatedTime.set(java.lang.System.currentTimeMillis());
    mPlaces = new java.util.ArrayList(pingoPlaces);
    mPlacesSubject.onNext(mPlaces);
    success.accept(mPlaces);
}