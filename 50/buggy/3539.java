public static void fetchNotifications(com.frederic_rouffineau.singvibes.MainActivity a) {
    com.frederic_rouffineau.singvibes.logic.network.queries.news.NotificationsQuery q = new com.frederic_rouffineau.singvibes.logic.network.queries.news.NotificationsQuery();
    q.prepare(a);
    q.execute();
}