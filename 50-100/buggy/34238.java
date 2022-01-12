public <T> T inject(net.e6tech.elements.common.resources.Resources resources, T object) {
    if (isDirty()) {
        injectionList.add(object);
        resources.onOpen();
    }
    if ((injector) != null) {
        _inject(resources, injector, object);
    }else {
        injectionList.add(object);
    }
    return object;
}