@java.lang.Override
public amfsmall.SmallBasicSet next() {
    current = theAntiChain.nextSetBit(((current) + 1));
    return new amfsmall.SmallBasicSet(current);
}