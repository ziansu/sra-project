public java.math.BigDecimal lastValue() {
    if ((numbers.size()) > 0) {
        return ((java.math.BigDecimal) (numbers.peek()));
    }else {
        return null;
    }
}