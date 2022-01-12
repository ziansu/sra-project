private com.alibaba.fastjson.JSONArray extractPlaces(java.util.List<cn.momia.api.product.sku.Sku> skus) {
    com.alibaba.fastjson.JSONArray placesJson = new com.alibaba.fastjson.JSONArray();
    for (cn.momia.api.product.sku.Sku sku : skus) {
        int placeId = sku.getPlaceId();
        if (placeId <= 0)
            continue;
        
        com.alibaba.fastjson.JSONObject placeJson = new com.alibaba.fastjson.JSONObject();
        placeJson.put("id", placeId);
        placeJson.put("name", sku.getPlaceName());
        placeJson.put("address", sku.getAddress());
        placesJson.add(placeJson);
    }
    return placesJson;
}