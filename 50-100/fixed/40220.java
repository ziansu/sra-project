public boolean hasOverlappingTime(seedu.multitasky.model.entry.ReadOnlyEntry other) {
    if (!(other instanceof seedu.multitasky.model.entry.Event)) {
        throw new java.lang.AssertionError("Non-event object is given to Event.hasOverlappingTime().");
    }
    return !(((other.getEndDateAndTime().compareTo(this.getStartDateAndTime())) < 0) || ((other.getStartDateAndTime().compareTo(this.getEndDateAndTime())) > 0));
}