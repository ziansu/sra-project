private java.lang.String enterLanguage(java.lang.String language) {
    javax.script.ScriptEngine engine = mGVRContext.getScriptManager().getEngine(language);
    if (engine == null) {
        return "Cannot find the language engine for " + language;
    }
    mScriptHandler = new org.gearvrf.debug.ScriptHandler(mGVRContext, language, engine);
    mShell.setLineProcessor(mScriptHandler);
    return null;
}