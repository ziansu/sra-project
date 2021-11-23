@java.lang.Deprecated
public java.util.List<teammates.common.datatransfer.attributes.StudentProfileAttributes> getAllStudentProfiles() {
    java.util.List<teammates.common.datatransfer.attributes.StudentProfileAttributes> list = new java.util.LinkedList<>();
    java.util.List<teammates.storage.entity.StudentProfile> entities = getStudentProfileEntities();
    for (teammates.storage.entity.StudentProfile student : entities) {
        if (!(teammates.storage.api.JDOHelper.isDeleted(student))) {
            list.add(new teammates.common.datatransfer.attributes.StudentProfileAttributes(student));
        }
    }
    return list;
}