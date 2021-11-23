public void instamojoResponse(java.lang.String status, java.lang.String orderId, java.lang.String transactionId, java.lang.String paymentId) {
    loaderView.setVisibility(View.GONE);
    if (status.equals("ok")) {
        checkPaymentStatus(this.paymentId);
    }else
        if (status.equals("error")) {
            setScreen("retry");
        }
    
}