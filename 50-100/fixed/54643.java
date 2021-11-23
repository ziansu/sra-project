private void doPrint(com.google.protobuf.DescriptorProtos.FileDescriptorProto fdp, java.lang.String javaPackage, java.lang.String outerClassName) {
    java.util.List<com.google.protobuf.DescriptorProtos.DescriptorProto> messageDescList = fdp.getMessageTypeList();
    java.util.List<com.google.protobuf.DescriptorProtos.ServiceDescriptorProto> serviceDescList = fdp.getServiceList();
    java.util.List<com.google.protobuf.DescriptorProtos.EnumDescriptorProto> enumDescList = fdp.getEnumTypeList();
    printEnum(enumDescList, javaPackage, outerClassName);
    printMessage(messageDescList, javaPackage, outerClassName);
    printService(serviceDescList, javaPackage);
}