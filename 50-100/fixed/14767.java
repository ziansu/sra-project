@org.junit.Test
@org.junit.experimental.categories.Category(value = org.openmrs.reference.groups.BuildTests.class)
public void editPersonTest() {
    org.openmrs.reference.page.AdministrationPage administrationPage = homePage.goToAdministration();
    org.openmrs.reference.page.ManagePersonPage managePersonPage = administrationPage.clickOnManagePersons();
    managePersonPage.setPersonName(personInfo.givenName);
    org.openmrs.reference.page.PersonFormPage personFormPage = managePersonPage.clickFirstFoundPerson();
    personFormPage.setFamilyNameField("newFamilyName");
    personFormPage.savePerson();
    org.hamcrest.MatcherAssert.assertThat(personFormPage.getFamilyName(), org.hamcrest.core.Is.is("newFamilyName"));
}