public void downloadOneMessageBy(java.lang.String userOid, org.andstatus.app.data.LatestUserMessages lum) throws org.andstatus.app.net.http.ConnectionException {
    java.util.List<org.andstatus.app.net.social.MbTimelineItem> messages = execContext.getMyAccount().getConnection().getTimeline(TimelineType.USER.getConnectionApiRoutine(), org.andstatus.app.net.social.TimelinePosition.getEmpty(), 1, userOid);
    for (org.andstatus.app.net.social.MbTimelineItem item : messages) {
        if ((item.getType()) == (MbTimelineItem.ItemType.MESSAGE)) {
            insertOrUpdateMsg(item.mbMessage, lum);
            break;
        }
    }
}