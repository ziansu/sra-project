@java.lang.Override
protected boolean constraint() {
    return (agent.isTouchingResource(ResourceType.ExtremPoint)) && (!(agent.seeMarker()));
}