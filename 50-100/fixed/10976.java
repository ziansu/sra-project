public long getNextChapterStart(long position) {
    long ret = com.monsterbutt.homeview.plex.media.PlexVideoItem.BAD_CHAPTER_START;
    if (hasChapters()) {
        for (com.monsterbutt.homeview.plex.media.Chapter chapter : mVideo.getChapters()) {
            if ((chapter.getStartTimeOffset()) >= position) {
                ret = chapter.getStartTimeOffset();
                break;
            }
        }
    }
    return ret;
}