public java.lang.String toString() {
    if (((_numerator) % (_denominator)) == 0) {
        return java.lang.String.valueOf(((_numerator) / (_denominator)));
    }else {
        java.lang.String sign = "";
        if (((_numerator) ^ (_denominator)) < 0) {
            sign = "-";
        }
        return ((sign + (java.lang.String.valueOf(java.lang.Math.abs(_numerator)))) + "/") + (java.lang.String.valueOf(java.lang.Math.abs(_denominator)));
    }
}