private static java.util.BitSet getCBC_IV() {
    java.util.BitSet CBC_IV = new java.util.BitSet(64);
    java.security.SecureRandom generator = new java.security.SecureRandom();
    generator.setSeed(java.lang.System.currentTimeMillis());
    for (int i = 0; i < 64; i++) {
        CBC_IV.set(i, generator.nextBoolean());
    }
    return DES.HextoBitSet("000fffffffffffff");
}