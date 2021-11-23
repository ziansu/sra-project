public void removeItemFromBuffer(int departurePoint) {
    android.util.Log.d("mbta", "Removing item");
    getDB().deleteDeparturePointFromProfile(com.github.tommywalsh.mbta.ProfileEditHelper.BUFFER_PROFILE, departurePoint);
}