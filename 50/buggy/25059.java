public static boolean isOwner(org.apache.openmeetings.db.entity.calendar.OmCalendar object) {
    return ((object.getOwner()) != null) && (org.apache.openmeetings.web.app.WebSession.getUserId().equals(object.getOwner().getId()));
}