public void getMonetaryMetrics() {
    java.lang.String url = "cash/BAML";
    java.lang.String ob = networkCom(url, (("{\"user-token\": " + (token)) + "}\n"), "GET");
    org.json.JSONObject obj = new org.json.JSONObject(ob);
    cash = obj.getLong("cash");
    maxBuy = obj.getInt("max-can-buy");
    maxSell = obj.getInt("max-can-sell");
}