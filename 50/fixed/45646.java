@java.lang.Override
java.lang.String getAtomXml() {
    return java.lang.String.format(com.microsoft.azure.servicebus.management.QueueDescription.ATOM_XML_FORMAT, com.microsoft.azure.servicebus.management.SerializerUtil.serializeDuration(this.lockDuration), this.maxSizeInMegaBytes, this.requiresSession, com.microsoft.azure.servicebus.management.SerializerUtil.serializeDuration(this.defaultMessageTimeToLive), this.enablePartitioning);
}