public static void logExternalMessage(java.lang.String eventName, java.lang.String eventDetails) {
    com.risevision.viewer.client.utils.ViewerHtmlUtils.logExternalMessageNative(eventName, com.risevision.viewer.client.ViewerEntryPoint.getDisplayId(), Global.VIEWER_VERSION, eventDetails);
}