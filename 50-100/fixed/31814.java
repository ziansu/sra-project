@java.lang.Override
public org.jruby.runtime.builtin.IRubyObject truncate(org.jruby.runtime.ThreadContext context, org.jruby.runtime.builtin.IRubyObject arg) {
    java.math.BigInteger self = value;
    if ((self.compareTo(java.math.BigInteger.ZERO)) == 1) {
        return floor(context, arg);
    }else
        if ((self.compareTo(java.math.BigInteger.ZERO)) == (-1)) {
            return ceil(context, arg);
        }else {
            return this;
        }
    
}