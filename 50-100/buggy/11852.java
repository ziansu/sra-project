@java.lang.Deprecated
public org.jruby.runtime.builtin.IRubyObject executeUnder(org.jruby.runtime.ThreadContext context, org.jruby.Callback method, org.jruby.runtime.builtin.IRubyObject[] args, org.jruby.runtime.Block block) {
    context.preExecuteUnder(this, block);
    try {
        return method.execute(this, args, block);
    } finally {
        context.postExecuteUnder();
    }
}