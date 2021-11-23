public static com.group8.model.RestaurantType findConstantByValue(java.lang.String value) {
    for (com.group8.model.RestaurantType rt : com.group8.model.RestaurantType.values()) {
        if (rt.toString().equals(value))
            return rt;
        
    }
    return null;
}