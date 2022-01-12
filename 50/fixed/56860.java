public void retirePerson() {
    clickOn(org.openmrs.reference.page.PersonFormPage.RETIRE_PERSON);
    waitForTextToBePresentInElement(org.openmrs.reference.page.PersonFormPage.OPENMRS_MSG, "Person deleted");
}