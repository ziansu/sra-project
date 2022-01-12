public static int getForumIndexByFid(int fid) {
    for (int i = 0; i < (net.jejer.hipda.utils.HiUtils.FORUM_IDS.length); i++) {
        if (fid == (net.jejer.hipda.utils.HiUtils.FORUM_IDS[i])) {
            return i;
        }
    }
    return -1;
}