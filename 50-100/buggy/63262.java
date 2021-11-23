public void saveEvents(io.joshworks.snappy.rest.RestExchange exchange) {
    io.joshworks.eventry.shared.event.EventStream events = exchange.body().asObject(io.joshworks.eventry.shared.event.EventStream.class);
    if (events == null) {
        throw new io.joshworks.eventry.shared.event.InvalidEvent("Invalid event data");
    }
    io.joshworks.eventry.shared.event.EventStream created = store.saveEvents(events);
    created.forEach(EventBroadcaster::broadcast);
    exchange.status(201).send(created);
}