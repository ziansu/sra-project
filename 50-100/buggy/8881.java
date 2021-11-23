public void renderCreate(org.eclipse.rap.clientscripting.internal.ClientListenerBinding binding, org.eclipse.rwt.internal.protocol.IClientObject clientObject) {
    clientObject.create(org.eclipse.rap.clientscripting.internal.ClientListenerBindingSynchronizer.TYPE);
    clientObject.set("listener", org.eclipse.rap.clientscripting.internal.ClientListenerBindingSynchronizer.getId(binding.getListener()));
    clientObject.set("targetObject", org.eclipse.rwt.lifecycle.WidgetUtil.getId(binding.getWidget()));
    clientObject.set("eventType", binding.getEventType());
}