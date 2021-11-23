@org.jruby.anno.JRubyMethod(name = "&", required = 1)
public org.jruby.runtime.builtin.IRubyObject op_and19(org.jruby.runtime.ThreadContext context, org.jruby.runtime.builtin.IRubyObject other) {
    return op_and(context, convertToInteger(context, other));
}