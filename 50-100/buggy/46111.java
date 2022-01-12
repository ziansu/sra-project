public org.jruby.runtime.builtin.IRubyObject decode(org.jruby.Ruby runtime, java.nio.ByteBuffer enc) {
    long l;
    if ((org.jruby.platform.Platform.BYTE_ORDER) == (org.jruby.platform.Platform.BIG_ENDIAN)) {
        l = org.jruby.util.Pack.decodeLongBigEndian(enc);
    }else {
        l = org.jruby.util.Pack.decodeLongLittleEndian(enc);
    }
    return org.jruby.RubyBignum.bignorm(runtime, java.math.BigInteger.valueOf(l).and(new java.math.BigInteger("FFFFFFFFFFFFFFFF", 16)));
}