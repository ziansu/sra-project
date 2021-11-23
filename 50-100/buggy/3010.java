public model.Payment searchPayment(model.Payment payment) throws exception.PaymentException {
    dao.PaymentDAO paymentDAO = new dao.PaymentDAO();
    if (payment != null) {
        int paymentId = payment.getPaymentId();
        payment = paymentDAO.get(paymentId);
        if (payment == null) {
            throw new exception.PaymentException(payment.PAYMENT_SERVICE_CANT_BE_NULL);
        }
    }else {
        throw new exception.PaymentException(payment.PAYMENT_SERVICE_CANT_BE_NULL);
    }
    return payment;
}