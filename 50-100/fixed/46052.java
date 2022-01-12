ch.sportchef.business.event.entity.Event update(@javax.validation.constraints.NotNull
final ch.sportchef.business.event.entity.Event event) {
    final ch.sportchef.business.event.entity.Event previousEvent = events.getOrDefault(event.getEventId(), event);
    if (!(previousEvent.getVersion().equals(event.getVersion()))) {
        throw new javax.persistence.OptimisticLockException("You tried to update an event that was modified concurrently!");
    }else {
        events.put(event.getEventId(), ch.sportchef.business.event.entity.EventBuilder.fromEvent(event).build());
        return event;
    }
}