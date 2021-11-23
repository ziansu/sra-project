public static org.json.JSONObject getSeminar(java.lang.String pSeminarId) {
    java.net.URL url;
    try {
        url = new java.net.URL(java.lang.String.format(RestRoutes.GET_SEMINAR, pSeminarId));
        return br.usp.ime.mac5743.ep1.seminarioime.api.RestAPIUtil.getInstance().execute(url, br.usp.ime.mac5743.ep1.seminarioime.api.RestAPIUtil.GET).get();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return null;
    }
}