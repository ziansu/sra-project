private void enterLanguage(java.lang.String language) {
    javax.script.ScriptEngine engine = mGVRContext.getScriptManager().getEngine(language);
    if (engine == null) {
        mShell.getOutputConverter().convertOutput(("Cannot find the language engine for " + language));
        return ;
    }
    mScriptHandler = new org.gearvrf.debug.ScriptHandler(mGVRContext, language, engine);
    mShell.setLineProcessor(mScriptHandler);
}