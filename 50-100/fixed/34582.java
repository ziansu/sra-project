public boolean equals(org.headsupdev.agile.storage.issues.IssueRelationship that) {
    if ((type) != (that.type)) {
        return false;
    }
    if ((owner) != null ? !(owner.equals(that.owner)) : (that.owner) != null) {
        return false;
    }
    if ((related) != null ? !(related.equals(that.related)) : (that.related) != null) {
        return false;
    }
    return true;
}