public static java.util.ArrayList<java.lang.String> getAllProfiles(android.content.Context context) {
    java.util.LinkedHashSet<java.lang.String> hashSet = new java.util.LinkedHashSet<>();
    for (com.pokescanner.objects.NotificationItem notificationItem : com.pokescanner.helper.PokemonListLoader.getNotificationList()) {
        hashSet.addAll(notificationItem.getProfiles());
    }
    hashSet.add(com.pokescanner.settings.Settings.getPreferenceString(context, Settings.PROFILE));
    return new java.util.ArrayList<>(hashSet);
}