private long getTotalTime() {
    java.util.Date stopTime = new java.util.Date();
    return (stopTime.getTime()) - (com.paymentez.api.PaymentezCCSDK.startTime.getTime());
}