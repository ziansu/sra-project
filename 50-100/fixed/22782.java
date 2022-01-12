public static org.json.JSONArray parseXueYuan(java.lang.String html, java.lang.String droplistId) {
    org.json.JSONArray result = new org.json.JSONArray();
    org.jsoup.nodes.Document doc = org.jsoup.Jsoup.parse(html);
    org.jsoup.select.Elements element = doc.getElementById(droplistId).select("option");
    org.json.JSONObject pro = null;
    for (org.jsoup.nodes.Element e : element) {
        pro = new org.json.JSONObject();
        pro.put(e.text(), e.val());
        result.put(pro);
    }
    return result;
}