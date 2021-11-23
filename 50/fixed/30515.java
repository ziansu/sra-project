public void removeItemFromBuffer(int departurePoint) {
    getDB().deleteDeparturePointFromProfile(com.github.tommywalsh.mbta.ProfileEditHelper.BUFFER_PROFILE, departurePoint);
}