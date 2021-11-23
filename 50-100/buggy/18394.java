@java.lang.Override
protected void init(final org.apache.nifi.processor.ProcessorInitializationContext context) {
    final java.util.List<org.apache.nifi.components.PropertyDescriptor> descriptors = new java.util.ArrayList<org.apache.nifi.components.PropertyDescriptor>();
    descriptors.add(com.dataflowdeveloper.processors.process.TensorFlowProcessor.MODEL_DIR);
    this.descriptors = java.util.Collections.unmodifiableList(descriptors);
    final java.util.Set<org.apache.nifi.processor.Relationship> relationships = new java.util.HashSet<org.apache.nifi.processor.Relationship>();
    relationships.add(com.dataflowdeveloper.processors.process.TensorFlowProcessor.REL_SUCCESS);
    relationships.add(com.dataflowdeveloper.processors.process.TensorFlowProcessor.REL_FAILURE);
    relationships.add(com.dataflowdeveloper.processors.process.TensorFlowProcessor.REL_UNMATCHED);
    this.relationships = java.util.Collections.unmodifiableSet(relationships);
}