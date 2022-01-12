@java.lang.Override
public java.lang.Boolean getValue() throws me.legrange.panstamp.NetworkException {
    byte[] val = reg.getValue();
    int byteIdx = epDef.getPosition().getBytePos();
    int bitIdx = epDef.getPosition().getBitPos();
    return ((val[byteIdx]) & (1 << bitIdx)) != 0;
}