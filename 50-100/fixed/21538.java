public static java.lang.Boolean isEmpty(org.xcolab.client.activities.pojo.ActivityEntry activity, javax.portlet.PortletRequest request) {
    try {
        return org.xcolab.portlets.feeds.wrappers.SocialActivityWrapper.isEmpty(activity);
    } catch (java.lang.Throwable e) {
        org.xcolab.portlets.feeds.wrappers.SocialActivityWrapper._log.error(("Some error interpreting activity: " + (e.getMessage())));
        return false;
    }
}