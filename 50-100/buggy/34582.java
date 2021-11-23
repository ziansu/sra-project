public boolean equals(org.headsupdev.agile.storage.issues.IssueRelationship that) {
    if ((type) != (that.type)) {
        return false;
    }
    if (!(owner.equals(that.owner))) {
        return false;
    }
    if (!(related.equals(that.related))) {
        return false;
    }
    return true;
}