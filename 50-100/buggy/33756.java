@java.lang.Override
public org.jruby.runtime.builtin.IRubyObject truncate(org.jruby.runtime.ThreadContext context, org.jruby.runtime.builtin.IRubyObject args) {
    long self = getLongValue();
    if (self > 0) {
        return floor(context, args);
    }else
        if (self < 0) {
            return ceil(context, args);
        }else {
            return this;
        }
    
}