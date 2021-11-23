private static void createEntry(com.google.gson.JsonObject productJsonObject, java.util.ArrayList<com.google.gson.JsonObject> productListings) {
    com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
    jsonObject.add("product_name", productJsonObject.get("product_name"));
    com.google.gson.JsonArray jsonArray = new com.google.gson.JsonArray();
    for (com.google.gson.JsonObject list : productListings) {
        java.lang.String listing = list.toString();
        jsonArray.add(listing);
    }
    jsonObject.add("listings", jsonArray);
    com.sortable.challenge.Main.outputJson.add(jsonObject);
}