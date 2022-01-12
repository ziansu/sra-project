public com.qa.smurf.entities.Payment getPayment() {
    com.qa.smurf.entities.User paymentUser = paymentService.getCurrentUser(currentUser.getUserId());
    payment = paymentService.getPayment(paymentUser);
    return payment;
}