public org.jruby.runtime.builtin.IRubyObject decode(org.jruby.Ruby runtime, java.nio.ByteBuffer enc) {
    if ((org.jruby.platform.Platform.BYTE_ORDER) == (org.jruby.platform.Platform.BIG_ENDIAN))
        return runtime.newFixnum(org.jruby.util.Pack.decodeShortBigEndian(enc));
    else
        return runtime.newFixnum(org.jruby.util.Pack.decodeShortLittleEndian(enc));
    
}