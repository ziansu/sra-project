@java.lang.Override
public void onResult(com.google.android.gms.location.places.PlaceBuffer places) {
    if ((places.getStatus().isSuccess()) && ((places.getCount()) > 0)) {
        final com.google.android.gms.location.places.Place place = places.get(0);
        pub.name = java.lang.String.valueOf(place.getName());
        pub.address = java.lang.String.valueOf(place.getAddress());
        pub.rating = (place.getRating()) * (multiplier);
    }
    places.release();
}