@com.squareup.otto.Subscribe
public void onMileStoneSaved(com.rorlig.babylog.otto.events.milestones.MilestoneSaveEvent event) {
    java.util.Date date = new java.util.Date(event.getYear(), ((event.getMonth()) - 1), event.getDay());
    setCompleted(event.getPosition(), date, true);
}