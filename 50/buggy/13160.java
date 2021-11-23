@org.testng.annotations.Test(groups = { "cPage" }, dependsOnMethods = { "cPage_verifyReservationCharges" }, alwaysRun = true, timeOut = 10000)
public void cPage_verifyCopies() throws java.lang.InterruptedException {
    if (isOnHold = true) {
        rpID = "OnHold";
    }
    bookingEngine.Reservation_confirmed.cPage_verifyCopies(paymentProcessor, rpID, "confirmed", "", "", isChargeToAccount);
}