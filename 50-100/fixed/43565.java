public com.example.helloandroid.prefs.NextBusDirection init(com.example.helloandroid.feed.model.Direction model) {
    stops = new java.util.ArrayList<com.example.helloandroid.prefs.NextBusStop>();
    super.init(model.getName(), model.getTitle(), model.getTag());
    for (com.example.helloandroid.feed.model.Stop stop : model.getStops()) {
        com.example.helloandroid.prefs.NextBusStop nbs = new com.example.helloandroid.prefs.NextBusStop();
        nbs.init(stop);
        stops.add(nbs);
    }
    return this;
}