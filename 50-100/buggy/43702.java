@java.lang.Override
public int getTimesPlayedByUser(java.lang.String user_id, java.lang.String song_id) {
    long startTime = java.lang.System.currentTimeMillis();
    int timesPlayed = 0;
    if (profileCache.containsUserProfile(user_id)) {
        timesPlayed = profileCache.getUserProfile(user_id).getTimesPlayedOfSong(song_id);
    }else {
        timesPlayed = getTimes(user_id, song_id);
    }
    java.lang.System.out.println(java.lang.String.format("getTimesPlayedByUser(%s, %s) = %d timesPlayed ran for %d ms", user_id, song_id, timesPlayed, ((java.lang.System.currentTimeMillis()) - startTime)));
    return timesPlayed;
}