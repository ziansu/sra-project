public static JSONObject getMatchById(java.math.BigInteger matchId) throws java.lang.Exception {
    java.lang.String link = ((((Main.apiurl) + "match/v3/matches/") + matchId) + "?api_key=") + (Main.apiKey);
    java.lang.String match = Main.getHTML(link);
    return new JSONObject(match);
}