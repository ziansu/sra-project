protected void setWriter(org.jruby.runtime.builtin.IRubyObject io) {
    org.jruby.Ruby runtime = this.getRuntime();
    runtime.defineVariable(new org.jruby.RubyGlobal.OutputGlobalVariable(runtime, com.aptana.scripting.model.CommandBlockRunner.STDOUT_GLOBAL, io), Scope.GLOBAL);
    runtime.defineGlobalConstant(com.aptana.scripting.model.CommandBlockRunner.STDOUT_CONSTANT, io);
    runtime.getGlobalVariables().alias(com.aptana.scripting.model.CommandBlockRunner.STDOUT_GLOBAL2, com.aptana.scripting.model.CommandBlockRunner.STDOUT_GLOBAL);
    runtime.getGlobalVariables().alias(com.aptana.scripting.model.CommandBlockRunner.DEFOUT_GLOBAL, com.aptana.scripting.model.CommandBlockRunner.STDOUT_GLOBAL);
}