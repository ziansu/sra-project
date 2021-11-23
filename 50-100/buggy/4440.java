private ca.concordia.inse6260.entities.AcademicRecordEntry hasCourse(final java.util.List<ca.concordia.inse6260.entities.AcademicRecordEntry> records, final long courseEntryId) {
    ca.concordia.inse6260.entities.AcademicRecordEntry existentRecord = null;
    ca.concordia.inse6260.entities.Course course = courseEntryDao.findOne(courseEntryId).getCourse();
    for (ca.concordia.inse6260.entities.AcademicRecordEntry record : records) {
        if (((record.getCourseEntry()) != null) && (record.getCourseEntry().getCourse().equals(course))) {
            existentRecord = record;
            break;
        }
    }
    return existentRecord;
}