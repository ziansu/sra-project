public com.qa.smurf.entities.Payment getPayment() {
    java.lang.System.out.println(("About to get payment for user:" + (currentUser.getUserId())));
    com.qa.smurf.entities.User paymentUser = paymentService.getCurrentUser(currentUser.getUserId());
    payment = paymentService.getPayment(paymentUser);
    return payment;
}