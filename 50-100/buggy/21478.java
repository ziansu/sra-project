private void runScript(actor.msg.RunScript runScriptMessage) throws java.lang.Exception {
    javax.script.Invocable invocableEngine = getEngine(runScriptMessage.getFile());
    api.ServiceAPI serviceAPI = new api.AkkaServiceAPI(runScriptMessage.getTargetActor());
    invocableEngine.invokeFunction("main", serviceAPI, runScriptMessage.getIdentity(), runScriptMessage.getSubmittedDocument());
}