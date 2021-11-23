public static groovyx.gpars.activeobject.InternalActor create(final java.lang.Object groupId) {
    final groovyx.gpars.group.PGroup group;
    group = ("".equals(groupId)) ? groovyx.gpars.actor.Actors.defaultActorPGroup : groovyx.gpars.activeobject.ActiveObjectRegistry.getInstance().findGroupById(((java.lang.String) (groupId)));
    if (group == null)
        throw new java.lang.IllegalArgumentException((("Cannot find a PGroup " + groupId) + " in the ActiveObjectRegistry. Please make sure you register the group prior to instantiating ActiveObjects."));
    
    final groovyx.gpars.activeobject.InternalActor internalActor = new groovyx.gpars.activeobject.InternalActor();
    internalActor.setParallelGroup(group);
    internalActor.silentStart();
    return internalActor;
}