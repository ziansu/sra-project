public static void fetchNotifications(com.frederic_rouffineau.singvibes.MainActivity a) {
    new com.frederic_rouffineau.singvibes.logic.network.queries.news.NotificationsQuery(a).execute();
}