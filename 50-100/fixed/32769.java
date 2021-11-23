public net.openhft.chronicle.hash.serialization.internal.SerializationBuilder<E> maxSize(long maxSize) {
    this.maxSize = maxSize;
    if ((copyingInterop) == (net.openhft.chronicle.hash.serialization.internal.SerializationBuilder.CopyingInterop.FROM_MARSHALLER)) {
        metaInteropProvider(net.openhft.chronicle.hash.serialization.internal.CopyingMetaBytesInterop.<E, net.openhft.lang.io.serialization.BytesMarshaller<E>>providerForBytesMarshaller(instancesAreMutable, maxSize));
    }else
        if ((copyingInterop) == (net.openhft.chronicle.hash.serialization.internal.SerializationBuilder.CopyingInterop.FROM_WRITER)) {
            metaInteropProvider(net.openhft.chronicle.hash.serialization.internal.CopyingMetaBytesInterop.<E, net.openhft.chronicle.hash.serialization.internal.BytesWriter<E>>providerForBytesWriter(instancesAreMutable));
        }
    
    return this;
}