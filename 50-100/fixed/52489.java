public boolean isAnyFieldEdited() {
    if (((this.startDateTime) != null) || ((this.endDateTime) != null)) {
        return true;
    }
    return seedu.geekeep.commons.util.CollectionUtil.isAnyPresent(this.title, this.location, this.tags);
}