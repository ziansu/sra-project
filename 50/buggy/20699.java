public events.regularevents.RegularEventDispatcher.ExecutionTimeWrapper planNextExecution(events.regularevents.RegularEvent event) {
    return new events.regularevents.RegularEventDispatcher.ExecutionTimeWrapper(event, ((java.lang.System.currentTimeMillis()) + (event.frequency)));
}