@java.lang.Override
public gov.nysenate.openleg.service.spotcheck.calendar.SpotCheckObservation<gov.nysenate.openleg.service.spotcheck.calendar.CalendarId> check(java.util.Calendar content, java.util.Calendar reference) {
    gov.nysenate.openleg.service.spotcheck.calendar.SpotCheckReferenceId referenceId = new gov.nysenate.openleg.service.spotcheck.calendar.SpotCheckReferenceId(SpotCheckRefType.LBDC_CALENDAR_ALERT, reference.getPublishedDateTime().truncatedTo(java.time.temporal.ChronoUnit.SECONDS));
    gov.nysenate.openleg.service.spotcheck.calendar.SpotCheckObservation<gov.nysenate.openleg.service.spotcheck.calendar.CalendarId> observation = new gov.nysenate.openleg.service.spotcheck.calendar.SpotCheckObservation(referenceId, reference.getId());
    if (calendarsEqual(content, reference)) {
        return observation;
    }else {
        compareSupplementals(observation, content, reference);
        compareActiveLists(observation, content, reference);
        return observation;
    }
}