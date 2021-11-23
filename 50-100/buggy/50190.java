public static void activitiesFor(java.lang.String login, java.lang.String networks, java.lang.Integer page, java.lang.Integer size) {
    models.Member member = models.Member.findByLogin(login);
    java.util.List<models.ProviderType> providers = new java.util.ArrayList<models.ProviderType>();
    for (java.lang.String network : networks.split("~")) {
        models.ProviderType provider = models.ProviderType.valueOf(network);
        providers.add(provider);
    }
    java.util.List<models.activity.Activity> _activities = models.activity.Activity.recentsForMember(member, providers, page, size);
    render("tags/activities.html", _activities);
}