public void verifyPaidSymbol() {
    removeOutstanding = (removeOutstanding) + "PAID";
    try {
        java.lang.Thread.sleep(2000);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    clickcFeeNo.click();
    try {
        java.lang.Thread.sleep(2000);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    clickcFeeNo.click();
    withTimeoutOf(15, java.util.concurrent.TimeUnit.SECONDS).waitForAllTextToAppear(removeOutstanding);
}