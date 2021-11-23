private java.util.List<com.netflix.imflibrary.KLVPacket.Header> getSubDescriptorKLVHeader(com.netflix.imflibrary.st0377.header.InterchangeObject.InterchangeObjectBO essenceDescriptor) throws java.io.IOException {
    java.util.List<com.netflix.imflibrary.KLVPacket.Header> subDescriptorHeaders = new java.util.ArrayList<>();
    com.netflix.imflibrary.IMFErrorLogger imfErrorLogger = new com.netflix.imflibrary.IMFErrorLoggerImpl();
    java.util.List<com.netflix.imflibrary.st0377.header.InterchangeObject.InterchangeObjectBO> subDescriptors = this.getHeaderPartition().getSubDescriptors(essenceDescriptor);
    for (com.netflix.imflibrary.st0377.header.InterchangeObject.InterchangeObjectBO subDescriptorBO : subDescriptors) {
        if (subDescriptorBO != null) {
            subDescriptorHeaders.add(subDescriptorBO.getHeader());
        }
    }
    return subDescriptorHeaders;
}