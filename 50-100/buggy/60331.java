public java.lang.String runApplescript(java.lang.String script) {
    try {
        java.lang.System.out.println(moe.tristan.Lyrical.model.integration.system.macOS.appleScriptEngine);
        java.lang.String returnedData;
        if ((returnedData = ((java.lang.String) (moe.tristan.Lyrical.model.integration.system.macOS.appleScriptEngine.eval(script)))) != null) {
            return returnedData;
        }
    } catch (javax.script.ScriptException e) {
        java.lang.System.err.println("Script returned void instead of an instance of Object");
    }
    return "NOT_FOUND";
}