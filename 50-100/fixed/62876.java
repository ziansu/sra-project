public java.lang.String getGIDs() {
    java.lang.String gidList = "";
    if (((mPInfo.gids) != null) && ((mPInfo.gids.length) != 0)) {
        for (int gid : mPInfo.gids) {
            gidList = ((gidList + "") + gid) + "-";
        }
    }else {
        gidList = "-- null";
    }
    return gidList.substring(0, ((gidList.length()) - 1));
}