public java.lang.Boolean getValid() {
    if ((getNumeratorValue()) == 0.0) {
        return java.lang.Boolean.FALSE;
    }
    if ((getDenominatorValue()) == 0.0) {
        return java.lang.Boolean.FALSE;
    }
    if ((getNumeratorValue()) > (getDenominatorValue())) {
        return java.lang.Boolean.FALSE;
    }
    return java.lang.Boolean.TRUE;
}