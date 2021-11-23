public void encode(org.jruby.Ruby runtime, org.jruby.runtime.builtin.IRubyObject o, org.jruby.util.ByteList result) {
    int s = (o == (runtime.getNil())) ? 0 : overflowQuad(org.jruby.util.Pack.num2quad(o));
    encodeShortByByteOrder(result, s);
}