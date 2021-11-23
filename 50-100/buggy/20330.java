public int setTrackVolume(umusic.uMusicTrack.TrackNumber trackNumber, int volume) {
    int v;
    trackVolume = volume;
    if ((volume == 0) || ((masterVolume) == 0)) {
        v = 0;
    }else {
        v = (volume * (masterVolume)) / 125;
    }
    java.lang.System.out.println(v);
    return trackList[trackNumber.ordinal()].setVolume(v);
}