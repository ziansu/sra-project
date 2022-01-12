private teammates.common.datatransfer.attributes.GenderType transformData() {
    teammates.storage.entity.StudentProfile studentProfile = new teammates.storage.entity.StudentProfile(student2GoogleId);
    java.lang.String gender = studentProfile.getGender().toString();
    studentProfile.importGender(gender);
    return studentProfile.getGender();
}