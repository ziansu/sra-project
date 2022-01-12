@java.lang.Override
public org.jruby.runtime.builtin.IRubyObject truncate(org.jruby.runtime.ThreadContext context, org.jruby.runtime.builtin.IRubyObject arg) {
    long self = getLongValue();
    if (self > 0) {
        return floor(context, arg);
    }else
        if (self < 0) {
            return ceil(context, arg);
        }else {
            return this;
        }
    
}