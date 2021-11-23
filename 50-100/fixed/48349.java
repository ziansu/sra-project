@org.jruby.anno.JRubyMethod
public org.jruby.runtime.builtin.IRubyObject lock(org.jruby.runtime.ThreadContext context) {
    try {
        context.getThread().enterSleep();
        try {
            checkRelocking(context);
            context.getThread().lockInterruptibly(lock);
        } catch (java.lang.InterruptedException ex) {
            context.pollThreadEvents();
            throw context.getRuntime().newConcurrencyError(ex.getLocalizedMessage());
        }
    } finally {
        context.getThread().exitSleep();
    }
    return this;
}