public java.math.BigInteger getWeiFromText(java.lang.String text, java.lang.String decimalSeparator) {
    if ((text == null) || (text.isEmpty()))
        return java.math.BigInteger.ZERO;
    
    java.lang.String amountToSend = stripSeparator(text, decimalSeparator);
    java.lang.Double amount;
    try {
        amount = java.lang.Double.parseDouble(amountToSend);
    } catch (java.lang.NumberFormatException e) {
        amount = 0.0;
    }
    return org.web3j.utils.Convert.toWei(amount.toString(), Convert.Unit.ETHER).toBigInteger();
}