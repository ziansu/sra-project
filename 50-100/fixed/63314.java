public void enterInfoFillingTheFormTwice(java.lang.String patientIdentifier) throws java.lang.Exception {
    findPatient(patientIdentifier);
    clickOnCheckIn();
    selectFirstOptionFor("typeOfVisit");
    selectSecondOptionFor("paymentAmount");
    findInputInsideSpan("receiptNumber").sendKeys(("receipt #" + (org.openqa.selenium.Keys.RETURN)));
    selectNotToPrintWristbandIfQuestionPresent();
    clickOnNoButton();
    selectSecondOptionFor("typeOfVisit");
    selectSecondOptionFor("paymentAmount");
    findInputInsideSpan("receiptNumber").sendKeys(("receipt #" + (org.openqa.selenium.Keys.RETURN)));
    selectNotToPrintWristbandIfQuestionPresent();
    confirmData();
    confirmPopup();
}