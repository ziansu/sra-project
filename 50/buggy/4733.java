@java.lang.Override
public java.util.List<intellimate.izou.sdk.resource.Resource> provideResource(java.util.List<? extends intellimate.izou.sdk.resource.Resource> list, java.util.Optional<intellimate.izou.events.Event> optional) {
    return triggered(list, optional).stream().collect(java.util.stream.Collectors.toList());
}