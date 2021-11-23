public java.lang.Double getSignedAmount(java.lang.String selfId) {
    if (selfId.equals(by))
        return -(amount);
    else
        return amount;
    
}