@com.squareup.otto.Subscribe
public void onMileStoneSaved(com.rorlig.babylog.otto.events.milestones.MilestoneSaveEvent event) {
    java.util.Calendar c = java.util.Calendar.getInstance();
    c.set(java.util.Calendar.YEAR, event.getYear());
    c.set(java.util.Calendar.MONTH, ((event.getMonth()) - 1));
    c.set(java.util.Calendar.DATE, event.getDay());
    setCompleted(event.getPosition(), c.getTime(), true);
}