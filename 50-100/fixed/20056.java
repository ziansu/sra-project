public static synchronized edu.illinois.library.cantaloupe.script.ScriptEngine getScriptEngine() throws edu.illinois.library.cantaloupe.script.DelegateScriptDisabledException, java.io.IOException, javax.script.ScriptException {
    if ((edu.illinois.library.cantaloupe.script.ScriptEngineFactory.scriptEngine) == null) {
        final edu.illinois.library.cantaloupe.config.Configuration config = edu.illinois.library.cantaloupe.config.ConfigurationFactory.getInstance();
        if (config.getBoolean(edu.illinois.library.cantaloupe.script.ScriptEngineFactory.DELEGATE_SCRIPT_ENABLED_CONFIG_KEY, false)) {
            edu.illinois.library.cantaloupe.script.ScriptEngineFactory.scriptEngine = new edu.illinois.library.cantaloupe.script.RubyScriptEngine();
            edu.illinois.library.cantaloupe.script.ScriptEngineFactory.scriptEngine.load(org.apache.commons.io.FileUtils.readFileToString(edu.illinois.library.cantaloupe.script.ScriptEngineFactory.getScriptFile()));
        }else {
            throw new edu.illinois.library.cantaloupe.script.DelegateScriptDisabledException();
        }
    }
    return edu.illinois.library.cantaloupe.script.ScriptEngineFactory.scriptEngine;
}