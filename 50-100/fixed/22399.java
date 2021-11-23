public static com.chatak.parkinfiniamarket.Product fromJson(org.json.JSONObject jsonObject) {
    com.chatak.parkinfiniamarket.Product product = new com.chatak.parkinfiniamarket.Product();
    try {
        product.setCakeId(jsonObject.getString("cakeId"));
        product.setPrice(jsonObject.getDouble("price"));
        product.setWeight(jsonObject.getString("weight"));
        product.setTitle(jsonObject.getString("title"));
    } catch (org.json.JSONException e) {
        e.printStackTrace();
        return null;
    }
    return product;
}