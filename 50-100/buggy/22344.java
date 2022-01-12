private java.lang.String checksum(org.sonar.batch.protocol.output.BatchReport.Issue rawIssue) {
    org.sonar.batch.issue.tracking.FileHashes hashedSource = sourceHashHolder.getHashedSource();
    if (rawIssue.hasLine()) {
        com.google.common.base.Preconditions.checkState(((rawIssue.getLine()) <= (hashedSource.length())), "Invalid line number for issue %s. File has only %s line(s)", rawIssue, hashedSource.length());
        return hashedSource.getHash(rawIssue.getLine());
    }
    return null;
}