public static void libraryrate(java.lang.Long rate, java.lang.Long trackid) {
    controllers.User user = controllers.Users.getCurrentUser();
    if (trackid == null) {
        trackid = user.room.currentPlayingLibrary.track.id;
    }
    user.noPlayableTrack = false;
    user.save();
    controllers.Catalog.rateinuserlibrary(trackid, user, rate);
}