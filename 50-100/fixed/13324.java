public int getCurrentChapter(long position) {
    int ret = 0;
    if (hasChapters()) {
        for (com.monsterbutt.homeview.plex.media.Chapter chapter : mVideo.getChapters()) {
            if ((chapter.getStartTimeOffset()) >= position)
                break;
            
            ++ret;
        }
    }
    return ret;
}