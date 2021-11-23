@java.lang.Override
public java.util.List<intellimate.izou.sdk.resource.Resource> provideResource(java.util.List<? extends intellimate.izou.sdk.resource.Resource> list, java.util.Optional<intellimate.izou.events.Event> optional) {
    return new java.util.ArrayList(triggered(list, optional));
}