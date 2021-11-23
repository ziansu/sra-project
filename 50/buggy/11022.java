public org.jboss.tools.drools.reddeer.kienavigator.properties.ServerProperties properties() {
    selectAction("Properties");
    org.jboss.reddeer.swt.api.Shell shell = new org.jboss.reddeer.swt.impl.shell.DefaultShell("Could Not Accept Changes ");
    if (shell.isVisible()) {
        new org.jboss.reddeer.swt.impl.button.PushButton("OK").click();
    }
    return new org.jboss.tools.drools.reddeer.kienavigator.properties.ServerProperties();
}