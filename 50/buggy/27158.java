@org.junit.Before
public void before() {
    initializeInMemoryDatabase();
    this.service = org.openmrs.api.context.Context.getService(org.openmrs.module.patientflags.api.FlagService.class);
    executeDataSet(((org.openmrs.patientflags.rest.test.FlagTest.XML_DATASET_PATH) + (getTestDatasetFilename(org.openmrs.patientflags.rest.test.FlagTest.XML_DATASET))));
}