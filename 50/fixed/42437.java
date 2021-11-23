public boolean isAnyFieldEdited() {
    return seedu.watodo.commons.util.CollectionUtil.isAnyPresent(this.description, this.startDate, this.endDate, this.tags, this.status);
}