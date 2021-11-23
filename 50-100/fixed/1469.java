@java.lang.Override
public com.amazonaws.util.awsclientgenerator.domainmodels.SdkFileEntry[] generateSourceFiles(com.amazonaws.util.awsclientgenerator.domainmodels.codegeneration.ServiceModel serviceModel) throws java.lang.Exception {
    com.amazonaws.util.awsclientgenerator.domainmodels.codegeneration.Shape queueAttributeNameShape = serviceModel.getShapes().get("QueueAttributeName");
    if (queueAttributeNameShape != null) {
        queueAttributeNameShape.getEnumValues().add("SentTimestamp");
        queueAttributeNameShape.getEnumValues().add("ApproximateFirstReceiveTimestamp");
        queueAttributeNameShape.getEnumValues().add("ApproximateReceiveCount");
        queueAttributeNameShape.getEnumValues().add("SenderId");
    }
    return super.generateSourceFiles(serviceModel);
}