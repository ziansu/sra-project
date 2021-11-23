public void validate(org.kumoricon.model.attendee.Attendee attendee) throws org.kumoricon.service.validate.ValidationException {
    if (attendee.isMinor()) {
        if (((attendee.getParentFormReceived()) == null) || (!(attendee.getParentFormReceived()))) {
            throw new jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException("Error: Parental consent form has not been received");
        }
    }
    attendeeValidator.validate(attendee);
}