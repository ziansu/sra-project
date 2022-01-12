public java.util.List<com.example.helloandroid.prefs.NextBusDirection> getDirections() {
    if ((((directions) == null) && ((routes) != null)) && ((agency) != null)) {
        directions = new java.util.ArrayList<com.example.helloandroid.prefs.NextBusDirection>();
        for (com.example.helloandroid.feed.model.Direction model : com.example.helloandroid.NextBus.getRouteConfig(agency.getTag(), route.getTag())) {
            directions.add(new com.example.helloandroid.prefs.NextBusDirection().init(model));
        }
    }
    return directions;
}