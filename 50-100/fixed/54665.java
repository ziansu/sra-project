public boolean copyAttributesFrom(org.dhis2.messenger.model.InboxModel other) {
    boolean changed = false;
    this.subject = other.subject;
    if (this.dateObj.before(other.dateObj)) {
        changed = true;
        this.read = false;
    }
    this.dateObj = other.dateObj;
    this.date = other.date;
    this.lastSender = other.lastSender;
    this.time = other.time;
    return changed;
}