private void parseAddedPIT(org.waag.histograph.queue.Task task) throws java.io.IOException {
    namePrint("Parsing added PIT...");
    java.util.Map<java.lang.String, java.lang.String> params = task.getParams();
    java.lang.String hgid = params.get(HistographTokens.General.HGID);
    findRejectedRelationsHgid(hgid);
    if (params.containsKey(HistographTokens.PITTokens.URI)) {
        java.lang.String uri = params.get(HistographTokens.PITTokens.URI);
        findRejectedRelationsURI(uri);
    }
}