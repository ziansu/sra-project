@java.lang.Override
public void encode19(org.jruby.Ruby runtime, org.jruby.runtime.builtin.IRubyObject o, org.jruby.util.ByteList result) {
    encodeLongByByteOrder(result, org.jruby.util.Pack.num2quad19(o));
}