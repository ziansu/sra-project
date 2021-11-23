@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.flybits.core.api.FlybitsOptions builder = new com.flybits.core.api.FlybitsOptions.Builder(this).build();
    com.flybits.core.api.Flybits.include(this).initialize(builder);
    se.walkercrou.places.GooglePlaces client = new se.walkercrou.places.GooglePlaces(BuildConfig.GoogleApiKey);
    java.util.List<se.walkercrou.places.Place> places = client.getNearbyPlaces(200, 500, 2000, GooglePlaces.MAXIMUM_RESULTS);
    for (se.walkercrou.places.Place p : places) {
        java.lang.System.out.println(p);
    }
}