private void chooseTimeline(java.util.ArrayList<functions.Timeline> timelines, functions.Timeline current) {
    chooseTimeline.setValue(null);
    for (functions.Timeline t : timelines) {
        chooseTimeline.getItems().add(t);
    }
    chooseTimeline.setValue(current);
    currentTimeline(current);
    addEventsToTimeline(current);
    chooseTimeline.setOnAction(new javafx.event.EventHandler<javafx.event.ActionEvent>() {
        @java.lang.Override
        public void handle(javafx.event.ActionEvent event) {
            appListener.onTimelineSelected(chooseTimeline.getValue());
        }
    });
}