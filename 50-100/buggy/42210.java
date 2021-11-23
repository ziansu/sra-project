public void hyperlinkUpdate(javax.swing.event.HyperlinkEvent hyperlinkEvent) {
    if ((hyperlinkEvent.getEventType()) == (javax.swing.event.HyperlinkEvent.EventType.ACTIVATED)) {
        java.lang.String queryUrl = hyperlinkEvent.getURL().toString();
        if (queryUrl.startsWith(org.cytoscape.cpathsquared.internal.CpsWebServiceGuiClient.SERVER_URL)) {
            taskManager.setExecutionContext(context);
            taskManager.execute(new org.cytoscape.work.TaskIterator(new org.cytoscape.cpathsquared.internal.CpsWebServiceGuiClient.CpsNetworkAndViewTask(queryUrl, "")));
        }
    }
}