public static java.lang.String truncateBidPrice(org.json.JSONObject jsonObject) throws org.json.JSONException {
    android.util.Log.v("bidPrice", ("" + (jsonObject.getString("Bid"))));
    if (!(jsonObject.isNull("Bid"))) {
        java.lang.String bidPrice = java.lang.String.format("%.2f", java.lang.Float.parseFloat(jsonObject.getString("Bid")));
        return bidPrice;
    }else
        return "0.00";
    
}