public java.lang.Long cleanUp(zoo.services.CleanUp cleanUp) throws zoo.exceptions.AggregateLoadException, zoo.exceptions.NotIdempotentException, zoo.exceptions.ZooException {
    zoo.aggregates.AnimalAggregate animalAggregate = replay(cleanUp.getAnimalId(), cleanUp.getSequenceId());
    zoo.dto.Events<zoo.events.Event> events = animalAggregate.asCleanUpCommandHandler().handleCommand(cleanUp);
    if (!(events.getEvents().isEmpty())) {
        eventStore.save(events);
    }
    return events.getSequenceId();
}