public void tellMeWhatsTheTimeIn(java.util.List<java.lang.String> locations) {
    for (java.lang.String location : locations) {
        java.lang.String time = timeRetriever.timeFor(location);
        timeOutputRenderer.renderReport(location, time);
    }
}