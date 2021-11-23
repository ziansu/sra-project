public java.util.List<com.mirth.connect.model.DashboardStatus> getAllChannelStatuses() throws com.mirth.connect.client.core.ClientException {
    return getServlet(com.mirth.connect.client.core.api.servlets.ChannelStatusServletInterface.class).getChannelStatusList(null, false);
}