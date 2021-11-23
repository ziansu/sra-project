private org.spine3.gradle.compiler.validate.ValidatorMetadata createMetadata(com.google.protobuf.DescriptorProtos.DescriptorProto msgDescriptor) {
    final java.lang.String className = (msgDescriptor.getName()) + (org.spine3.gradle.compiler.validate.ValidatorMetadataAssembler.JAVA_CLASS_NAME_SUFFIX);
    final java.lang.String javaPackage = descriptorCache.get(msgDescriptor).getOptions().getJavaPackage();
    final org.spine3.gradle.compiler.validate.ValidatorMetadata result = new org.spine3.gradle.compiler.validate.ValidatorMetadata(javaPackage, className, msgDescriptor);
    return result;
}