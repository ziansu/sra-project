@org.jruby.anno.JRubyMethod(name = "chop!")
public org.jruby.runtime.builtin.IRubyObject chop_bang19(org.jruby.runtime.ThreadContext context) {
    modifyCheck();
    org.jruby.Ruby runtime = context.runtime;
    if ((value.getRealSize()) == 0)
        return runtime.getNil();
    
    view(0, choppedLength19(runtime));
    if ((getCodeRange()) != (org.jruby.util.StringSupport.CR_7BIT))
        clearCodeRange();
    
    return this;
}