@org.jruby.anno.JRubyMethod(name = "chop")
public org.jruby.runtime.builtin.IRubyObject chop19(org.jruby.runtime.ThreadContext context) {
    org.jruby.Ruby runtime = context.runtime;
    if ((value.getRealSize()) == 0)
        return org.jruby.RubyString.newEmptyString(runtime, getMetaClass(), value.getEncoding()).infectBy(this);
    
    return makeShared19(runtime, 0, choppedLength19(runtime, context));
}