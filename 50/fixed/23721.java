@java.lang.Override
public void executeScripts(@org.jboss.arquillian.core.api.annotation.Observes
org.jboss.arquillian.persistence.event.ExecuteScripts executeScriptsEvent) {
    for (org.jboss.arquillian.persistence.data.descriptor.SqlScriptDescriptor scriptDescriptor : executeScriptsEvent.getDescriptors()) {
        final java.lang.String script = org.jboss.arquillian.persistence.data.script.ScriptHelper.loadScript(scriptDescriptor.getLocation());
        executeScript(script);
    }
}