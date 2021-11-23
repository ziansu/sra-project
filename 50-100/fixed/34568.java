public jcl.numbers.IntegerStruct ash(final jcl.numbers.IntegerStruct integer) {
    if (integer.equals(jcl.numbers.IntegerStruct.ZERO)) {
        return this;
    }
    final java.math.BigInteger count = integer.bigInteger;
    final int countInt = count.intValue();
    final java.math.BigInteger shiftedBigInteger = bigInteger.shiftLeft(countInt);
    return new jcl.numbers.IntegerStruct(shiftedBigInteger);
}