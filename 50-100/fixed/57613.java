public void pauseEventsForProfile(sk.henrichg.phoneprofilesplus.Profile profile, boolean noSetSystemEvent) {
    java.util.List<sk.henrichg.phoneprofilesplus.EventTimeline> eventTimelineList = getEventTimelineList();
    for (sk.henrichg.phoneprofilesplus.Event event : getEventList()) {
        if ((event._fkProfileStart) == (profile._id))
            event.pauseEvent(this, eventTimelineList, false, true, noSetSystemEvent, false);
        
    }
}