private void setDefaultCreditCardEntity(java.lang.String creditCardId, io.reactivesw.payment.domain.model.CreditCard requestCreditCard) {
    if (requestCreditCard == null) {
        io.reactivesw.payment.domain.service.CreditCardService.LOG.debug("can not find credit card by id: {}.", creditCardId);
        throw new io.reactivesw.exception.NotExistException("Credit Card Not Exist");
    }
    requestCreditCard.setSelected(true);
    creditCardRepository.save(requestCreditCard);
}