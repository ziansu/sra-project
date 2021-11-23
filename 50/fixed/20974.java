public void logout() {
    mPlaces = new java.util.ArrayList<>();
    mPlacesSubject.onNext(mPlaces);
}