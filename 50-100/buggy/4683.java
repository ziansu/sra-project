@java.lang.Override
public org.sagebionetworks.bridge.models.studies.Study getStudy(java.lang.String identifier) {
    com.google.common.base.Preconditions.checkArgument(org.apache.commons.lang3.StringUtils.isNotBlank(identifier), Validate.CANNOT_BE_BLANK, "identifier");
    org.sagebionetworks.bridge.models.studies.Study study = cacheProvider.getStudy(identifier);
    if (study == null) {
        study = studyDao.getStudy(identifier);
        org.sagebionetworks.bridge.services.StudyServiceImpl.setLegacyFieldsIfAbsent(study);
        cacheProvider.setStudy(study);
    }
    return study;
}