private void updateStudentDetails(java.lang.String newName, java.lang.String newTeamName, java.lang.String newSectionName, java.lang.String newEmail, java.lang.String newGoogleId, java.lang.String newComments, boolean hasDocument, boolean keepUpdateTimestamp, teammates.storage.entity.CourseStudent courseStudent, java.lang.String lastName) {
    courseStudent.setName(newName);
    courseStudent.setLastName(lastName);
    courseStudent.setComments(newComments);
    courseStudent.setGoogleId(newGoogleId);
    courseStudent.setTeamName(newTeamName);
    courseStudent.setSectionName(newSectionName);
    if (hasDocument) {
        putDocument(new teammates.common.datatransfer.attributes.StudentAttributes(courseStudent));
    }
    courseStudent.keepUpdateTimestamp = keepUpdateTimestamp;
}