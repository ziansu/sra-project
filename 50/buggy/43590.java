public java.lang.Double getSignedAmount(java.lang.String selfId) {
    amount = (java.lang.Math.round(((amount) * 100))) / 100.0;
    if (selfId.equals(by))
        return -(amount);
    else
        return amount;
    
}