@java.lang.Override
public void onSuccess(java.lang.Boolean wasSuccessful) {
    if (wasSuccessful) {
        Console.MODULES.getMessageCenter().notify(new org.jboss.as.console.client.core.message.Message(("Successfully deleted server config " + (server.getName()))));
        getEventBus().fireEvent(new org.jboss.as.console.client.domain.events.StaleModelEvent(org.jboss.as.console.client.domain.events.StaleModelEvent.SERVER_CONFIGURATIONS));
        loadServerConfigurations(null);
    }else {
        Console.MODULES.getMessageCenter().notify(new org.jboss.as.console.client.core.message.Message(("Failed to delete server config " + (server.getName())), Message.Severity.Error));
    }
}