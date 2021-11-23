private org.jruby.runtime.DynamicScope getBlockScope(org.jruby.runtime.ThreadContext context, org.jruby.runtime.Block block, org.jruby.ir.interpreter.InterpreterContext interpreterContext) {
    org.jruby.runtime.DynamicScope newScope = block.getBinding().getDynamicScope();
    if (interpreterContext.pushNewDynScope()) {
        newScope = block.allocScope(newScope);
        context.pushScope(newScope);
    }else
        if (interpreterContext.reuseParentDynScope()) {
            context.pushScope(newScope);
        }
    
    return newScope;
}