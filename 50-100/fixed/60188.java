public com.fangzhich.sneakerlab.order.widget.CreditCardDialog withCreditCard(com.fangzhich.sneakerlab.cart.data.entity.CartEntity.Payment card) {
    this.card = card;
    if (card != null) {
        etCreditCardNumber.setText(card.card_number);
        etSecurityCode.setText(card.card_cvv);
        etExpiryDateNumber.setText((((card.card_year) + "/") + (card.card_month)));
        etBillingPostalCode.setText(card.zip_code);
    }
    return this;
}