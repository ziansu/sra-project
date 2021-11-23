public void deleteStudyReport(org.sagebionetworks.bridge.models.studies.StudyIdentifier studyId, java.lang.String identifier) {
    org.sagebionetworks.bridge.models.reports.ReportDataKey key = new org.sagebionetworks.bridge.models.reports.ReportDataKey.Builder().withReportType(ReportType.STUDY).withIdentifier(identifier).withStudyIdentifier(studyId).build();
    reportDataDao.deleteReportData(key);
    reportIndexDao.removeIndex(key);
}