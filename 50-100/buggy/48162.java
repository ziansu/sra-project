@java.lang.Override
public java.util.List<com.mirth.connect.model.DashboardStatus> getChannelStatusList(java.util.Set<java.lang.String> channelIds, boolean includeUndeployed) {
    if (org.apache.commons.collections4.CollectionUtils.isEmpty(channelIds)) {
        return redactChannelStatuses(com.mirth.connect.server.api.servlets.ChannelStatusServlet.engineController.getChannelStatusList());
    }else {
        return com.mirth.connect.server.api.servlets.ChannelStatusServlet.engineController.getChannelStatusList(redactChannelIds(channelIds));
    }
}