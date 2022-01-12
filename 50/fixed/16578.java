public static void showProfile(@android.support.annotation.NonNull
android.app.Fragment fragment, @android.support.annotation.Nullable
java.util.HashMap<java.lang.String, java.lang.String> extras) {
    if (fragment != null) {
        com.airmap.airmapsdk.networking.services.AirMap.showProfile(fragment, com.airmap.airmapsdk.networking.services.AirMap.getUserId(), extras);
    }
}