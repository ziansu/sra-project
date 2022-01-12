public java.util.List<java.lang.Class<? extends pipeline.PipelineObject>> getClassesProvided() {
    java.util.List<java.lang.Class<? extends pipeline.PipelineObject>> classes = new java.util.ArrayList<java.lang.Class<? extends pipeline.PipelineObject>>();
    classes.add(operator.vardb.SampleIDAnnotator.class);
    classes.add(operator.vardb.VariantDBUploader.class);
    return classes;
}