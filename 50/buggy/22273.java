@java.lang.Override
public synchronized void setSeed(byte[] seed) {
    super.setSeed(seed);
    setSeed(betterrandom.util.BinaryUtils.convertBytesToLong(seed, 0));
}