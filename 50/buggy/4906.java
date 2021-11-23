@hugo.weaving.DebugLog
private void onSearchSuccess(java.util.List<com.drknotter.episodilyzer.server.model.SaveSeriesInfo> resultList) {
    searchResults.clear();
    searchResults.addAll(resultList);
    recyclerView.setAdapter(new com.drknotter.episodilyzer.adapter.SearchShowsAdapter(resultList));
}