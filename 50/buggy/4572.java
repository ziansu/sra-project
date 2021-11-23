@java.lang.Override
protected ch.bfh.unicrypt.helper.converter.interfaces.Converter<ch.bfh.unicrypt.helper.array.classes.ByteArray, java.math.BigInteger> abstractGetBigIntegerConverter() {
    return ch.bfh.unicrypt.helper.converter.classes.biginteger.ByteArrayToBigInteger.getInstance(this.blockLength);
}