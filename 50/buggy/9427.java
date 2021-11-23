public void checkCardNumberFormat(java.lang.String cardNumber) {
    if ((getCardNumberFormat()) == 1) {
        mCardNumber = "**** **** **** " + (cardNumber.substring(((cardNumber.length()) - 4), 19));
    }
}