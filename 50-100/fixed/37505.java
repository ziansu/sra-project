public com.sandbox.runtime.models.SandboxScriptEngine get() {
    com.sandbox.runtime.models.SandboxScriptEngine engine = engines.poll();
    if (engine == null) {
        javax.script.ScriptEngine scriptEngine = context.getBean(javax.script.ScriptEngine.class);
        engine = new com.sandbox.runtime.models.SandboxScriptEngine(scriptEngine);
        initializeEngineIfNeeded(engine);
        prepareEngine(engine);
    }
    return postProcessEngine(engine);
}