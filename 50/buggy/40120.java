public boolean isObsolete() {
    return ((org.xtreemfs.foundation.TimeSync.getGlobalTime()) / 1000) > (latestExpireTime);
}