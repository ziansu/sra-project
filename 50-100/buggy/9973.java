@java.lang.Override
public io.reactivex.ObservableSource<prada.lab.android.pingo.model.Tag> apply(prada.lab.android.pingo.model.Tag tag) throws java.lang.Exception {
    java.util.List<prada.lab.android.pingo.model.Tag> tags = mTagSub.getValue();
    tags.add(tag);
    mTagSub.onNext(tags);
    prada.lab.android.pingo.model.PingoPlace place = findPlaceById(placeId);
    place.getTags().add(tag);
    mPlaces.remove(place);
    mPlaces.add(0, place);
    mPlacesSubject.onNext(mPlaces);
    return io.reactivex.Observable.just(tag);
}