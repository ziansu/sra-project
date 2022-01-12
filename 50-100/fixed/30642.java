public void fire(javafx.event.EventType<?> type, co.andrewbates.grade.data.Model target) {
    co.andrewbates.grade.data.DatabaseEventHandler.DatabaseEvent event = new co.andrewbates.grade.data.DatabaseEventHandler.DatabaseEvent(target);
    java.util.List<javafx.event.EventHandler<co.andrewbates.grade.data.DatabaseEventHandler.DatabaseEvent>> h = handlers.get(type);
    if (h != null) {
        for (javafx.event.EventHandler<co.andrewbates.grade.data.DatabaseEventHandler.DatabaseEvent> handler : h) {
            handler.handle(event);
        }
    }
}