@java.lang.Override
public synchronized void setSeed(byte[] seed) {
    setSeed(betterrandom.util.BinaryUtils.convertBytesToLong(seed, 0));
}