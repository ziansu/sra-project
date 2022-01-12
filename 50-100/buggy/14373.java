@java.lang.Override
public void install(org.teavm.vm.spi.TeaVMHost host) {
    org.teavm.flavour.json.emit.SerializerDependencyListener serializerDep = new org.teavm.flavour.json.emit.SerializerDependencyListener();
    org.teavm.flavour.json.emit.DeserializerDependencyListener deserializerDep = new org.teavm.flavour.json.emit.DeserializerDependencyListener();
    host.add(serializerDep);
    host.add(deserializerDep);
    host.add(new org.teavm.model.MethodReference(org.teavm.flavour.json.JSON.class, "getClassSerializer", java.lang.String.class, org.teavm.flavour.json.serializer.JsonSerializer.class), new org.teavm.flavour.json.emit.SerializerGenerator(serializerDep));
    host.add(new org.teavm.model.MethodReference(org.teavm.flavour.json.JSON.class, "findClassDeserializer", java.lang.String.class, org.teavm.flavour.json.deserializer.JsonDeserializer.class), new org.teavm.flavour.json.emit.DeserializerGenerator(deserializerDep));
}