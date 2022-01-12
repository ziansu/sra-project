public static int getForumIndexByFid(java.lang.String fid) {
    for (int i = 0; i < (net.jejer.hipda.utils.HiUtils.FORUM_IDS.length); i++) {
        if (fid.equals(((net.jejer.hipda.utils.HiUtils.FORUM_IDS[i]) + ""))) {
            return i;
        }
    }
    return -1;
}