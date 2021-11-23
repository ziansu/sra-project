@java.lang.Override
public void preProcessData() {
    org.matsim.core.api.experimental.events.EventsManager eventsManager = org.matsim.core.events.EventsUtils.createEventsManager();
    org.matsim.contrib.emissions.events.EmissionEventsReader emissionReader = new org.matsim.contrib.emissions.events.EmissionEventsReader(eventsManager);
    eventsManager.addHandler(this.warmHandler);
    eventsManager.addHandler(this.coldHandler);
    eventsManager.addHandler(new playground.agarwalamit.analysis.emission.sorting.FilteredColdEmissionPerLinkHandler(30.0, 9));
    emissionReader.parse(this.emissionEventsFile);
}