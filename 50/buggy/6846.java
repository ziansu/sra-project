protected org.apache.ignite.internal.binary.BinaryMarshaller binaryMarshaller(org.apache.ignite.binary.BinarySerializer serializer, java.util.Collection<org.apache.ignite.binary.BinaryTypeConfiguration> cfgs) throws org.apache.ignite.IgniteCheckedException {
    return binaryMarshaller(null, null, serializer, cfgs);
}