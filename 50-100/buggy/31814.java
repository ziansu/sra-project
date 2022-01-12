@java.lang.Override
public org.jruby.runtime.builtin.IRubyObject truncate(org.jruby.runtime.ThreadContext context, org.jruby.runtime.builtin.IRubyObject args) {
    java.math.BigInteger self = value;
    if ((self.compareTo(java.math.BigInteger.ZERO)) == 1) {
        return floor(context, args);
    }else
        if ((self.compareTo(java.math.BigInteger.ZERO)) == (-1)) {
            return ceil(context, args);
        }else {
            return this;
        }
    
}