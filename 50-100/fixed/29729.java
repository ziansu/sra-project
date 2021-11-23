public java.math.BigInteger getWeiFromText(java.lang.String text, java.lang.String decimalSeparator) {
    if ((text == null) || (text.isEmpty()))
        return java.math.BigInteger.ZERO;
    
    java.lang.String amountToSend = stripSeparator(text, decimalSeparator);
    return org.web3j.utils.Convert.toWei(amountToSend, Convert.Unit.ETHER).toBigInteger();
}