@java.lang.Override
public java.lang.Object retrieve(sif3.common.model.SIFZone zone, sif3.common.model.SIFContext context, sif3.common.model.PagingInfo pagingInfo, sif3.common.model.RequestMetadata metadata) throws sif3.common.exception.PersistenceException, sif3.common.exception.UnsupportedQueryException {
    logger.debug(((("Retrieve Students for " + (getZoneAndContext(zone, context))) + " and RequestMetadata = ") + metadata));
    java.util.ArrayList<sif.dd.au30.model.StudentPersonalType> studentList = fetchStudents(systemic.sif3.demo.rest.provider.StudentPersonalProvider.students, pagingInfo);
    sif.dd.au30.model.StudentCollectionType studentCollection = dmObjectFactory.createStudentCollectionType();
    studentCollection.getStudentPersonal().addAll(studentList);
    return studentCollection;
}