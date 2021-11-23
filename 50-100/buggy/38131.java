@org.jbehave.core.annotations.Given(value = "a Serverlet named '$serverletName' with properties file: '$propFile'")
public void createServerlet(@org.jbehave.core.annotations.Named(value = "serverletName")
final java.lang.String serverletName, @org.jbehave.core.annotations.Named(value = "propFile")
final java.lang.String propFile) throws com.devebot.opflow.exception.OpflowBootstrapException {
    serverlets.put(serverletName, com.devebot.opflow.OpflowLoader.createServerlet(com.devebot.opflow.OpflowServerlet.getListenerBuilder().build(), propFile));
    if (com.devebot.opflow.bdd.steps.OpflowServerletSteps.LOG.isDebugEnabled())
        com.devebot.opflow.bdd.steps.OpflowServerletSteps.LOG.debug((("Serverlet[" + serverletName) + "] has been created"));
    
}