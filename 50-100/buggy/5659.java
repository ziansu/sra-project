protected static void step3_verifymodifyCharge(java.lang.String paymentProcessor, java.lang.String rpID_to, java.lang.String policyType, boolean hasPenalty_to, java.lang.String modificationType, boolean isMissing) throws java.lang.InterruptedException {
    getWebBrowser().findElement(org.openqa.selenium.By.cssSelector(Locator_IBE.locator_confirm_button_modifyDatesRooms_Yes)).click();
    bookingEngine.Step1_selectDates.select_stayDates(hasPenalty_to, rpID_to);
    bookingEngine.Step2_showRooms.select_rooms(paymentProcessor, rpID_to, settings.Compute.getCurrency(paymentProcessor));
    bookingEngine.Step2_showRooms.go();
    bookingEngine.Step3_payInfo.verify_penalty(policyType, isMissing, modificationType, "step3");
}