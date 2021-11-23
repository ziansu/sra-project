private void setDefaultCreditCardEntity(io.reactivesw.payment.domain.model.CreditCard requestCreditCard) {
    requestCreditCard.setSelected(true);
    creditCardRepository.save(requestCreditCard);
}