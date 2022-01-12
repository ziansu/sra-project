public void clickFirstParticipantId() throws java.lang.InterruptedException {
    java.lang.Thread.sleep(org.motechproject.ebodac.uitest.page.BookingAppPrimeVaccinationPage.SLEEP_2000);
    clickWhenVisible(org.motechproject.ebodac.uitest.page.BookingAppPrimeVaccinationPage.PARTICIPANT_SELECT);
    java.lang.Thread.sleep(org.motechproject.ebodac.uitest.page.BookingAppPrimeVaccinationPage.SLEEP_2000);
    clickWhenVisible(org.motechproject.ebodac.uitest.page.BookingAppPrimeVaccinationPage.PARTICIPANT_SELECT);
    java.lang.Thread.sleep(org.motechproject.ebodac.uitest.page.BookingAppPrimeVaccinationPage.SLEEP_2000);
    findElement(org.motechproject.ebodac.uitest.page.BookingAppPrimeVaccinationPage.PARTICIPANT_ID_INPUT).sendKeys(Keys.ENTER);
    java.lang.Thread.sleep(org.motechproject.ebodac.uitest.page.BookingAppPrimeVaccinationPage.SLEEP_2000);
}