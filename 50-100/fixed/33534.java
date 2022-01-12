private void fetchMatchHistoryFromNetwork() {
    java.util.HashMap<java.lang.String, java.lang.String> args = new java.util.HashMap<>();
    args.put("account_id", mCurrentPlayer.getSteamId());
    args.put("matches_requested", "20");
    java.lang.String url = com.stratpoint.jdhrnndz.dota2junkie.network.UrlBuilder.buildGenericUrl(this, R.string.get_match_history, args);
    com.stratpoint.jdhrnndz.dota2junkie.network.ApiManager.fetchMatchHistory(this, url, this);
}