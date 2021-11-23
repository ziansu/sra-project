@java.lang.Override
public java.math.BigDecimal calculateDerivative(java.math.BigDecimal sum) {
    if ((java.math.BigDecimal.ZERO.compareTo(sum)) < 0) {
        return java.math.BigDecimal.ZERO;
    }else
        if ((java.math.BigDecimal.ZERO.compareTo(sum)) > 0) {
            return java.math.BigDecimal.ONE;
        }else {
            return java.math.BigDecimal.ZERO;
        }
    
}