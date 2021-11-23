@java.lang.Override
public int getnextPos(boolean yorn) {
    returnpos();
    if (((repeatMode) == (REPEAT_CURRENT)) && (!yorn)) {
        return playingIndex;
    }
    if (((playingIndex) + 1) >= (playList.size())) {
        if ((repeatMode) == (REPEAT_ALL)) {
            return 0;
        }
        return -1;
    }
    return (playingIndex) + 1;
}