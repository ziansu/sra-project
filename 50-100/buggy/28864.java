@java.lang.Override
public teammates.storage.entity.Instructor toEntity() {
    if ((key) != null) {
        return new teammates.storage.entity.Instructor(googleId, courseId, name, email, key, role, isDisplayedToStudents, displayedName, getTextFromInstructorPrivileges());
    }
    return new teammates.storage.entity.Instructor(googleId, courseId, isArchived, name, email, role, isDisplayedToStudents, displayedName, getTextFromInstructorPrivileges());
}