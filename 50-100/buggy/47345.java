@java.lang.Override
public com.dataloom.edm.internal.EntitySet read(com.hazelcast.nio.ObjectDataInput in) throws java.io.IOException {
    java.util.UUID id = com.kryptnostic.rhizome.hazelcast.serializers.AbstractUUIDStreamSerializer.deserialize(in);
    java.lang.String name = in.readUTF();
    org.apache.olingo.commons.api.edm.FullQualifiedName fqn = com.kryptnostic.conductor.rpc.serializers.FullQualifiedNameStreamSerializer.deserialize(in);
    java.lang.String title = in.readUTF();
    java.lang.String description = in.readUTF();
    com.dataloom.edm.internal.EntitySet es = new com.dataloom.edm.internal.EntitySet(id, fqn, name, title, description);
    return es;
}