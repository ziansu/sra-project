public net.meisen.dissertation.model.descriptors.NullDescriptor<I> getNullDescriptor() throws net.meisen.dissertation.exceptions.DescriptorModelException {
    if (!(supportsNullDescriptor())) {
        exceptionRegistry.throwRuntimeException(net.meisen.dissertation.exceptions.DescriptorModelException.class, 1004, getId());
    }
    if (!(createdNullDescriptor())) {
        nullDescriptor = new net.meisen.dissertation.model.descriptors.NullDescriptor<I>(this, idsFactory.getId());
        metaDataCache.cacheDescriptor(nullDescriptor);
    }
    return nullDescriptor;
}