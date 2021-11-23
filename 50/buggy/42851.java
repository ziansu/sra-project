public org.sonar.core.issue.db.BatchIssueDto setCreationDate(@javax.annotation.Nullable
java.util.Date creationDate) {
    this.creationDate = org.sonar.api.utils.DateUtils.dateToLong(creationDate);
    return this;
}