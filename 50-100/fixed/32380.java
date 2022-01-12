public edu.internet2.middleware.subject.Subject getSubject(edu.internet2.middleware.grouper.pspng.Provisioner provisioner) {
    if ((getChangelogEntry()) == null)
        return null;
    
    final java.lang.String subjectId = getSubjectId(true);
    final java.lang.String sourceId = getSubjectSourceId(true);
    if ((subjectId == null) || (sourceId == null))
        return null;
    
    edu.internet2.middleware.subject.Subject subject = provisioner.getSubject(subjectId, sourceId);
    return subject;
}