public calendar.EventProvider newEventProvider(java.lang.String group_name, java.lang.String group_id, db.Site site, db.DBConnection db) {
    calendar.EventProvider event_provider = new calendar.EventProvider(group_name).setAccessPolicy(new mosaic.GroupAccessPolicy(group_id, true, true, true, false)).setEventsAreOwned(true).setEventsCanRepeat(true).setEventsHaveColor(true).setEventsHaveEndTime(true).setEventsHaveStartTime(true).setEventsTable((("group_" + group_id) + "_events")).setSupportReminders(site);
    site.addModule(event_provider, db);
    return event_provider;
}