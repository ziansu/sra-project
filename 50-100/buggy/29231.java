public static void addParcel(java.lang.Object sender, java.lang.String method, int uid, int destination, java.lang.String description, double lat, double lng, int time, boolean courier) {
    ecs160.deliveries.API.get_instance()._addParcel(sender, method, uid, destination, description, lat, lng, time, courier);
}