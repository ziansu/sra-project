private void parseServerData(java.lang.String dataFromServer, android.view.View rootView) {
    if (dataFromServer != null) {
        java.util.List<java.lang.String> arrayOfRankedStatus = java.util.Arrays.asList(dataFromServer.split("/"));
        setupTitle(rootView);
        setupRank(rootView, arrayOfRankedStatus);
    }
}