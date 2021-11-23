private java.util.List<com.javarush.task.task27.task2712.statistic.event.EventDataRow> getEvents(com.javarush.task.task27.task2712.statistic.event.EventType eventType) {
    return storage.get(eventType);
}