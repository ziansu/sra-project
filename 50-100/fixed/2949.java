public static java.util.List<java.lang.String> getRestaurantIds() {
    java.lang.String restaurantIds = com.frostrocket.doordash.AppSharedPreferences.sharedPreferences.getString(com.frostrocket.doordash.AppSharedPreferences.RESTAURANT_IDS, "");
    if (!(android.text.TextUtils.isEmpty(restaurantIds))) {
        return new java.util.ArrayList<>(java.util.Arrays.asList(restaurantIds.split(",")));
    }else {
        return new java.util.ArrayList<>();
    }
}