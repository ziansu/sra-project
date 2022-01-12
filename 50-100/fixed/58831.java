public boolean checkIfWentToEditPage(org.openqa.selenium.By by) {
    this.getDriver().waitUntilElementIsVisible(org.openqa.selenium.By.id("PhenoTips.PatientClass_0_indication_for_referral"));
    try {
        getDriver().findElement(org.openqa.selenium.By.id("PhenoTips.PatientClass_0_indication_for_referral"));
        return true;
    } catch (org.openqa.selenium.NoSuchElementException e) {
        return false;
    }
}