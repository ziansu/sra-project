public java.util.Date getAsDate() {
    if ((isASAP()) || (isNEVER())) {
        return null;
    }
    return new java.util.Date(((((itsValue) - ((atnf.atoms.time.DUTC.get()) * 1000000L)) - 3506716800000000L) / 1000L));
}