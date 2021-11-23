public void executeHook(org.jruby.RubyObject hookRunner, cucumber.api.Scenario scenario) {
    org.jruby.runtime.builtin.IRubyObject[] jrubyArgs = new org.jruby.runtime.builtin.IRubyObject[2];
    jrubyArgs[0] = currentWorld;
    jrubyArgs[1] = org.jruby.javasupport.JavaEmbedUtils.javaToRuby(hookRunner.getRuntime(), scenario);
    hookRunner.callMethod("execute", jrubyArgs);
}