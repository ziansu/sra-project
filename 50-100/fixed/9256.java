public void callEvent(org.centauri.cloud.cloud.event.Event event) {
    java.util.Set<org.centauri.cloud.cloud.event.EventManager.EventHandler> eventSet = this.eventHandlers.get(event.getClass());
    if (eventSet == null)
        return ;
    
    for (org.centauri.cloud.cloud.event.EventManager.EventHandler eventHandler : eventSet) {
        try {
            eventHandler.method.invoke(eventHandler.instance, event);
        } catch (java.lang.Exception ex) {
            java.lang.System.err.println("Something went wrong on during event call: ");
            org.centauri.cloud.cloud.Cloud.getLogger().error(ex.getMessage(), ex);
        }
    }
}