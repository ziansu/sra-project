private boolean hasCourse(final java.util.List<ca.concordia.inse6260.entities.AcademicRecordEntry> records, final long courseEntryId) {
    boolean existentRecord = false;
    ca.concordia.inse6260.entities.Course course = courseEntryDao.findOne(courseEntryId).getCourse();
    for (ca.concordia.inse6260.entities.AcademicRecordEntry record : records) {
        if (((record.getCourseEntry()) != null) && (record.getCourseEntry().getCourse().equals(course))) {
            existentRecord = true;
            break;
        }
    }
    return existentRecord;
}