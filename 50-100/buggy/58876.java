public void infobox(java.lang.String query) {
    try {
        getFBKey();
        org.json.JSONArray topics = searchFB(query);
        for (int i = 0; i < (topics.length()); i++) {
            java.lang.String mid = topics.getJSONObject(i).getString("mid");
            if (topicFB(mid))
                break;
            
        }
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
    }
}