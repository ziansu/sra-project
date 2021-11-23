public static void storeJsonCart(android.content.SharedPreferences sp, com.itachi1706.shoppingtracker.Objects.JSONCart[] cartList) {
    com.google.gson.Gson gson = new com.google.gson.GsonBuilder().create();
    java.lang.String jsonString = gson.toJson(cartList, com.itachi1706.shoppingtracker.Objects.JSONCart.class);
    sp.edit().putString("cart_json", jsonString).apply();
}