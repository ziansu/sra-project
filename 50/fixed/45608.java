private double normalizeTime(de.hpi.smm.meetup_miner.rsvp_analysis.core.Event event, de.hpi.smm.meetup_miner.rsvp_analysis.core.Event baseEvent) {
    return ((((double) ((event.getTime()) - (baseEvent.getTime()))) / 1000) / 3600) / 24;
}