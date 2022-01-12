@java.lang.Override
public int getnextPos(boolean yorn) {
    if (((repeatMode) == (REPEAT_CURRENT)) && (!yorn)) {
        return returnpos();
    }
    if (((returnpos()) + 1) > (playList.size())) {
        if ((repeatMode) == (REPEAT_ALL)) {
            return 0;
        }
        return -1;
    }
    return (returnpos()) + 1;
}