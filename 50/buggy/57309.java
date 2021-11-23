@java.lang.Override
protected java.lang.Long computeRoundedValue() {
    return java.lang.Math.round(((getNumber()) * (java.lang.Math.pow(10, getPrecision()))));
}