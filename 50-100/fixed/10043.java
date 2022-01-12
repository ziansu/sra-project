@java.lang.Override
public byte[] getX2(byte[] Y1Bytes) {
    org.bouncycastle.math.ec.ECPoint.Fp Y1 = null;
    Y1 = ((org.bouncycastle.math.ec.ECPoint.Fp) (de.tsenger.animamea.tools.Converter.byteArrayToECPoint(Y1Bytes, curve).normalize()));
    return getX2(Y1).getEncoded(false);
}