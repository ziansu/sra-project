@java.lang.Override
public se.dreamteam.model.Product deserialize(com.google.gson.JsonElement json, java.lang.reflect.Type typeOfT, com.google.gson.JsonDeserializationContext context) throws com.google.gson.JsonParseException {
    final com.google.gson.JsonObject productJson = json.getAsJsonObject();
    final java.lang.String title = productJson.get("title").getAsString();
    final int price = productJson.get("price").getAsInt();
    final int quantity = productJson.get("quantity").getAsInt();
    final java.lang.String description = productJson.get("description").getAsString();
    return new se.dreamteam.model.Product(title, price, quantity, description);
}