protected void setErrorWriter(org.jruby.runtime.builtin.IRubyObject io) {
    org.jruby.Ruby runtime = getRuntime();
    runtime.defineVariable(new org.jruby.RubyGlobal.OutputGlobalVariable(runtime, com.aptana.scripting.model.CommandBlockRunner.STDERR_GLOBAL, io));
    runtime.defineGlobalConstant(com.aptana.scripting.model.CommandBlockRunner.STDERR_CONSTANT, io);
    runtime.getGlobalVariables().alias(com.aptana.scripting.model.CommandBlockRunner.DEFERR_GLOBAL, com.aptana.scripting.model.CommandBlockRunner.STDERR_GLOBAL);
}