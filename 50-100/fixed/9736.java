@java.lang.Override
public void preProcessData() {
    org.matsim.core.api.experimental.events.EventsManager eventsManager = org.matsim.core.events.EventsUtils.createEventsManager();
    org.matsim.contrib.emissions.events.EmissionEventsReader emissionReader = new org.matsim.contrib.emissions.events.EmissionEventsReader(eventsManager);
    eventsManager.addHandler(this.warmHandler);
    eventsManager.addHandler(this.coldHandler);
    emissionReader.parse(this.emissionEventsFile);
}