public com.sandbox.runtime.models.SandboxScriptEngine get() {
    com.sandbox.runtime.models.SandboxScriptEngine engine = engines.poll();
    if (engine == null) {
        com.sandbox.runtime.utils.GenericEngineQueue.logger.warn("Had to create engine during processing, engine queue is empty?");
        javax.script.ScriptEngine scriptEngine = context.getBean(javax.script.ScriptEngine.class);
        engine = new com.sandbox.runtime.models.SandboxScriptEngine(scriptEngine);
        initializeEngineIfNeeded(engine);
        prepareEngine(engine);
    }
    return postProcessEngine(engine);
}