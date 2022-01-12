public static org.sleuthkit.autopsy.casemodule.CaseMetadata create(org.sleuthkit.autopsy.casemodule.Case.CaseType caseType, java.lang.String caseName, java.lang.String caseNumber, java.lang.String examiner, java.lang.String caseDirectory, java.lang.String caseDatabaseName, java.lang.String caseTextIndexName) throws org.sleuthkit.autopsy.casemodule.CaseMetadata.CaseMetadataException {
    org.sleuthkit.autopsy.casemodule.CaseMetadata metadata = new org.sleuthkit.autopsy.casemodule.CaseMetadata(caseType, caseName, caseDirectory, caseDatabaseName, caseTextIndexName);
    metadata.write();
    return metadata;
}