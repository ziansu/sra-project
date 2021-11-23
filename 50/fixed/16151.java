@java.lang.Override
java.lang.String getAtomXml() {
    return java.lang.String.format(com.microsoft.azure.servicebus.management.TopicDescription.ATOM_XML_FORMAT, this.maxSizeInMegaBytes, this.enablePartitioning);
}