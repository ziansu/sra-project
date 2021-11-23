public void encode(org.jruby.Ruby runtime, org.jruby.runtime.builtin.IRubyObject o, org.jruby.util.ByteList result) {
    encodeShortByByteOrder(result, overflowQuad(org.jruby.util.Pack.num2quad(o)));
}