public teammates.common.datatransfer.attributes.AccountAttributes getCopy() {
    teammates.common.datatransfer.attributes.AccountAttributes copy = new teammates.common.datatransfer.attributes.AccountAttributes.AccountAttributesBuilder(googleId, name, email, institute).withStudentProfileAttributes(((this.studentProfile) == null ? null : this.studentProfile.getCopy())).withCreatedAt(createdAt).withIsInstructor(isInstructor).build();
    return copy;
}