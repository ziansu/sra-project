public java.lang.String getTextToShowInBubble(int pos) {
    com.wojtechnology.sunami.FireMixtape song = mVisibleData.get(pos);
    int state = mContext.getState();
    java.lang.String important = (state == (MainActivity.STATE_SONGS)) ? song.title : song.artist;
    char firstLetter = com.wojtechnology.sunami.SongManager.firstLetter(important, (state == (MainActivity.STATE_SONGS)));
    if ((firstLetter >= 'A') && (firstLetter <= 'Z')) {
        return java.lang.Character.toString(firstLetter);
    }
    return "#";
}