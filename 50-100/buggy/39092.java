public void stopEventsForProfile(sk.henrichg.phoneprofilesplus.Profile profile, boolean saveEventStatus) {
    java.util.List<sk.henrichg.phoneprofilesplus.EventTimeline> eventTimelineList = getEventTimelineList();
    for (sk.henrichg.phoneprofilesplus.Event event : getEventList()) {
        if ((event._fkProfileStart) == (profile._id))
            event.stopEvent(this, eventTimelineList, false, true, saveEventStatus);
        
    }
    restartEvents(false, false, true);
}