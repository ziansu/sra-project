@java.lang.Override
public D resolveDestination(java.lang.String name) throws org.springframework.messaging.core.DestinationResolutionException {
    D destination = this.resolvedDestinationCache.get(name);
    if (destination == null) {
        destination = this.targetDestinationResolver.resolveDestination(name);
        this.resolvedDestinationCache.put(name, destination);
    }
    return destination;
}