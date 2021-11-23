public java.lang.String getSsn() {
    if (!(ssn.matches("\\d{3}-\\d{2}-\\d{4}"))) {
        throw new java.lang.IllegalArgumentException("Must be in ###-##-#### format");
    }
    return ssn;
}