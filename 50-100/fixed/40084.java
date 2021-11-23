@org.junit.Ignore
@org.junit.Test
public void registerUnidentifiedPatient() throws java.lang.InterruptedException {
    homePage.openRegisterAPatientApp();
    patient = org.openmrs.reference.helper.PatientGenerator.generateTestPatient();
    org.junit.Assert.assertTrue(registrationPage.getNameInConfirmationPage().contains("--"));
    org.junit.Assert.assertTrue(registrationPage.getGenderInConfirmationPage().contains(patient.gender));
    patient.Uuid = patientIdFromUrl();
    assertPage(patientDashboardPage);
    org.junit.Assert.assertTrue(driver.getPageSource().contains("UNKNOWN UNKNOWN"));
}