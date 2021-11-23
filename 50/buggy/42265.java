@java.lang.Override
public net.openhft.chronicle.engine.api.query.ReadMarshallable apply(java.lang.Class aClass) {
    return map.computeIfAbsent(aClass, ObjectUtils::newInstance);
}