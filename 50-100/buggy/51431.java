protected final som.vmobjects.SNumber intOrBigInt(double value, som.vm.Universe universe) {
    if ((value > (java.lang.Long.MAX_VALUE)) || (value < (java.lang.Long.MIN_VALUE))) {
        return universe.newBigInteger(new java.math.BigInteger(java.lang.Double.toString(java.lang.Math.rint(value))));
    }else {
        return universe.newInteger(((long) (java.lang.Math.rint(value))));
    }
}